//package Case_Study.Service.Implement;
//
//
//import Case_Study.Model.*;
//import Case_Study.Service.BookingService;
//import Case_Study.Ultil.BookingComparator;
//
//import java.util.*;
//
//public class BookingServiceImpl implements BookingService {
//    static Set<Booking> bookingListSet = new TreeSet<>(new BookingComparator());
//    static Set<Booking> bookingListSetBuffer = new TreeSet<>(new BookingComparator());
//    static List<Customer> customerList = new CustomerServiceImpl().getListCustomer();
//
//    static Map<Room, Integer> listRoom = new FacilityServiceImpl().getListRoom();
//    static Map<Villa, Integer> listVilla = new FacilityServiceImpl().getListVilla();
//
//    static Map<Facility, Integer> serviceList = new FacilityServiceImpl().getListFacility();
//
//    static Scanner scanner = new Scanner(System.in);
//
//    public Set<Booking> bookingListSetToQueue() {
//        return bookingListSetBuffer;
//    }
//
//    public Set<Booking> getBookingList() {
//        return bookingListSet;
//    }
//
//    //hiển thị danh sách Customer để nhân viên chọn
//    public Customer chooseCustomer() {
//        //hiển thị danh sách khách hàng
//        System.out.println("\n----------Customer List----------");
//        for (Customer customer : customerList) {
//            System.out.println(customer.toStringDisplay());
//        }
//
//        //cho nhân viên chọn ID khách hàng
//        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
//        System.out.print("Input ID Customer Booking: ");
//        String id = scanner.nextLine();
//
//        while (true) {
//            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
////            if (id.equals("STOP")) {
////                return null;
////            }
//
//            //kiểm tra xem có id trong list không
//            for (Customer customer : customerList) {
//                if (id.equals(customer.getId())) {
//                    return customer;
//                }
//            }
//            //nếu nhập sai thì bắt người dùng nhập lại
//            System.out.print("Not Found ID Customer, Please re-input ID customer: ");
//            id = scanner.nextLine();
//        }
//    }
//
//    //hiển thị cơ sở facility để nhân viên chọn
//    public Facility chooseFacility() {
//        //hiển thị danh sách khách hàng
//        System.out.println("\n----------Facility List----------");
//        for (Map.Entry<Facility, Integer> element : serviceList.entrySet()) {
//            System.out.println("Service: " + element.getKey().toStringDisplay() + " USED: " + element.getValue());
//        }
//
//        //cho nhân viên chọn ID khách hàng
//        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
//        System.out.print("Input ID Facility Booking: ");
//        String idFacility = scanner.nextLine();
//
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
//    }
//
//    //thêm mới booking
//    @Override
//    public void addNew() {
//        //xét id booking, bắt đầu từ 1
//        int idBooking = 1;
//        //kiểm tra list booing có trống hay không
//        if (!bookingListSet.isEmpty()) {
//            idBooking = bookingListSet.size() + 1;
//        }
//        //chọn customer
//        Customer customer = chooseCustomer();
//
//        //chọn facility
//        Facility facility = chooseFacility();
//
//        //nhập ngày bắt đầu thuê
//        System.out.print("Enter start time rent: ");
//        String startTimeRent = scanner.nextLine();
//
//        //nhập ngày kết thúc thuê
//        System.out.print("Enter end time rent: ");
//        String endTimeRent = scanner.nextLine();
//
//        //tạo đối tượng booking
//        Booking booking = new Booking(idBooking, startTimeRent, endTimeRent, customer, facility);
//
//        //thêm booking vào list
//        bookingListSet.add(booking);
//        bookingListSetBuffer.add(booking);
//
//        //ghi file booking csv
//        System.out.println("-----ADD BOOKING SUCCESS!-----");
//    }
//
//    //add
//
//    //hiện danh sách booking
//    @Override
//    public void display() {
//        for (Booking booking : bookingListSet) {
//            System.out.println(booking.toStringDisplay());
//        }
//    }
//
//    @Override
//    public void edit() {
//
//    }
//}



