package Case_Study.Service.Implement;


import Case_Study.Model.*;
import Case_Study.Service.BookingService;
import Case_Study.Ultil.BookingComparator;
import Case_Study.Ultil.ReadAndWrite;
import b16_IO_Text_File.exercise.read_file_csv.Nation;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BookingServiceImpl implements BookingService {
    /*1. Khi thực hiện booking phải hiển thị danh sách khách hàng cho nhân viên chọn mã khách hàng,
     hiển thị danh sách dịch vụ cho nhân viên chọn mã dịch vụ.*/
    static Set<Booking> bookingListSet = new TreeSet<>(new BookingComparator());

    //list booking đệm, khi hoàn thành hợp đồng thì list booking này sẽ bị xoá hết dữ liệu
    static Set<Booking> bookingListSetBuffer = new TreeSet<>(new BookingComparator());

    //Set vì danh sách booking luôn khác nhau
    //dùng TreeSet vì list phải sắp xếp theo trật tụ là ngày

    //danh sách khách hàng
    static List<Customer> customerList = new CustomerServiceImpl().getListCustomer();

    //danh sách dịch vụ ROOM, VILLA
    static Map<Room, Integer> listRoom = new FacilityServiceImpl().getListRoom();
    static Map<Villa, Integer> listVilla = new FacilityServiceImpl().getListVilla();

    static Map<Facility, Integer> serviceList = new FacilityServiceImpl().getListFacility();

    //đường link CSV và HEADER
    private static final String PATH = "E:\\Codegym\\Module2\\src\\Case_Study\\Data\\Booking.csv";
    private static final String HEADER = "idBooking,  startDate,  endDate,  name, dateOfBirth, sex, id, phoneNumber, email, address, idCustomer, rankCustomer, facility, , , , , , , , ";
    //khai báo đọc ghi file CSV
    static ReadAndWrite<Booking> bookingReadAndWrite = new ReadAndWrite<>();


    static Scanner scanner = new Scanner(System.in);

    public BookingServiceImpl() {
        super();
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    //xuất list booking set để chuyển thành Queue bên hợp đồng
    public Set<Booking> bookingListSetToQueue() {
        //tiến hành đọc file để lấy dữ liệu
        List<String> stringList = bookingReadAndWrite.readFromFile(PATH);

        for (String string : stringList) {
            //cắt thành chuỗi
            String[] bookingArray = string.split(",");
            bookingListSetBuffer.add(new Booking());
        }
        return bookingListSetBuffer;
    }

    //xuất danh sách booking(lịch sử booking)
    public Set<Booking> getBookingList() {
        return bookingListSet;
    }

    //hiển thị danh sách Customer để nhân viên chọn
    public Customer chooseCustomer() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Customer List----------");
        for (Customer customer : customerList) {
            System.out.println(customer.toStringDisplay());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Customer Booking: ");
        String id = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
//            if (id.equals("STOP")) {
//                return null;
//            }

            //kiểm tra xem có id trong list không
            for (Customer customer : customerList) {
                if (id.equals(customer.getIdCustomer())) {
                    return customer;
                }
            }
            //nếu nhập sai thì bắt người dùng nhập lại
            System.out.print("Not Found ID Customer, Please re-input ID customer: ");
            id = scanner.nextLine();
        }
    }

    //hiển thị cơ sở facility để nhân viên chọn
    public String chooseFacility() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Facility List----------");
        for (Map.Entry<Facility, Integer> element : serviceList.entrySet()) {
            System.out.println("Service: " + element.getKey().toStringDisplay() + " USED: " + element.getValue());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại


        do {
            System.out.print("Input ID Facility Booking: ");
            String idFacility = scanner.nextLine();
            if (idFacility != null) return idFacility;
        } while (true);

//        while (true) {
//            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
////            if (idFacility.equals("STOP")) {
////                return null;
////            }
//
//            //kiểm tra xem có id trong list không
//            for (Map.Entry<Facility, Integer> facility : serviceList.entrySet()) {
//                if (idFacility.equals(facility.getKey().getIdFacility())) {
//                    //mỗi lần sử dụng dịch vụ thì số lần sử dụng tăng lên 1
//                    serviceList.put(facility.getKey(), facility.getValue() + 1);
//                    return facility.getKey();
//                }
//            }
//            //nếu nhập sai thì bắt người dùng nhập lại
//            System.out.print("Not Found ID Facility, Please re-input ID Facility: ");
//            idFacility = scanner.nextLine();
//        }
    }

    //thêm mới booking
    @Override
    public void addNew() {
        //xét id booking, bắt đầu từ 1
        int idBooking = 1;
        //kiểm tra list booking có trống hay không
        if (!bookingListSet.isEmpty()) {
            idBooking = bookingListSet.size() + 1;
        }
        //chọn customer
        Customer customer = chooseCustomer();

        //chọn facility
        String facilityId = chooseFacility();

        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Map<Facility, Integer> facilityIntegerMap = facilityService.getListFacility();

        Facility facility = facilityIntegerMap.keySet()
                .stream().filter(integer -> integer.getIdFacility().equals(facilityId)).findFirst().orElse(null);

        if (facility == null) {
            throw new IllegalArgumentException("Not found facility");
        }

        //nhập ngày bắt đầu thuê
        System.out.print("Enter start time rent: ");
        String startTimeRent = scanner.nextLine();

        //nhập ngày kết thúc thuê
        System.out.print("Enter end time rent: ");
        String endTimeRent = scanner.nextLine();

        //tạo đối tượng booking
        Booking booking = new Booking(idBooking, startTimeRent, endTimeRent, customer, facility);

        //thêm booking vào list
        bookingListSet.add(booking);
        bookingListSetBuffer.add(booking);

        // Ghi lại file booking
        bookingReadAndWrite.writeToFile(bookingListSet, PATH, HEADER);
        // Doc file facility tăng counter -> ghi lai

        if (facilityIntegerMap.containsKey(facility)) {
            facilityIntegerMap.put(facility, facilityIntegerMap.get(facility) + 1);
        } else {
            facilityIntegerMap.put(facility, 1);
        }

        List<String> listRooms = new ArrayList<>();
        Map<Room, Integer> roomMap = facilityIntegerMap.entrySet().stream()
                .filter(e -> e.getKey() instanceof Room).collect(Collectors.toMap(o -> (Room) o.getKey(), Map.Entry::getValue));

        for (Map.Entry<Room, Integer> element : roomMap.entrySet()) {
            listRooms.add(element.getKey().toString() + "," + element.getValue().toString());
        }

        facilityService.roomReadAndWrite.writeToFile(listRooms, FacilityServiceImpl.PATH_ROOM, FacilityServiceImpl.HEADER_ROOM);

        List<String> listVillas = new ArrayList<>();
        Map<Villa, Integer> villaMap = facilityIntegerMap.entrySet().stream()
                .filter(e -> e.getKey() instanceof Villa).collect(Collectors.toMap(o -> (Villa) o.getKey(), Map.Entry::getValue));

        for (Map.Entry<Villa, Integer> element : villaMap.entrySet()) {
            listVillas.add(element.getKey().toString() + "," + element.getValue().toString());
        }

        facilityService.villaReadAndWrite.writeToFile(listVillas, FacilityServiceImpl.PATH_VILLA, FacilityServiceImpl.HEADER_VILLA);

        //ghi file booking csv
        System.out.println("-----ADD BOOKING SUCCESS!-----");
    }

    //add

    //hiện danh sách booking
    //đọc file-> chuyển thành mảng->xuất mảng
    @Override
    public void display() {
        //đọc và xuất file ra hiển thị phòng, ngày, tên người book phòng
        File file = new File("E:\\Codegym\\Module2\\src\\Case_Study\\Data\\Booking.csv");
        BufferedInputStream bis = null;
        FileInputStream  fis= null;

        try
        {
            fis = new FileInputStream(file);

            bis = new BufferedInputStream(fis);

            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }

        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }


}



