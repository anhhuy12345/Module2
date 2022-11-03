package Case_Study.Service.Implement;


import Case_Study.Model.Booking;
import Case_Study.Service.PromotionService;
import Case_Study.Ultil.BookingComparator;
import Case_Study.Ultil.ReadAndWrite;

import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    static ReadAndWrite<Booking> bookingReadAndWrite = new ReadAndWrite<>();
    static Scanner scanner = new Scanner(System.in);

    //tạo list danh sách chứa các booking có cùng năm(năm là người dùng nhập vào)
    static Set<Booking> bookingListYear = new TreeSet<>(new BookingComparator());
    public  Set<Booking> getBookingListYear(){
        Set<Booking> bookings = new LinkedHashSet<>();
        List<String> stringList = bookingReadAndWrite.readFromFile("E:\\Codegym\\Module2\\src\\Case_Study\\Data\\Booking.csv");
        for (String string : stringList) {
            //cắt thành chuỗi
            String[] bookingArray = string.split(",");
            bookings.add(new Booking(Integer.parseInt(bookingArray[0]), bookingArray[1], bookingArray[2]));
        }
        return bookings;
    }
    @Override
    public void displayCustomerListUseServiceInYear() {
        //lây dữ liệu từ danh sách booking
            System.out.print("Enter display list YEAR: ");
            String year = scanner.nextLine();

            //tiến hành kiểm tra và hiển thị list có cùng năm
            Set<Booking> listBookingsFromDatabase = getBookingListYear();
            Set<Booking> resultBookingsFromSearch = new HashSet<>();
        if (getBookingListYear().size() == 0) {
            System.out.println("No data!!!!");
        } else {
            for (Booking booking : listBookingsFromDatabase) {
                // dd/MM/yyyy
                String[] yearStart = booking.getStartDate().split("/");
                String[] yearEnd = booking.getEndDate().split("/");
                if (yearStart[2].equals(year) && yearEnd[2].equals(year)) {
                    resultBookingsFromSearch.add(booking);
                }
            }

            //hiển thị danh sách Booking sử dụng cùng năm
            System.out.println("----------List Booking in " + year + "YEAR----------");
            for (Booking bookingYear : resultBookingsFromSearch) {
                System.out.println(bookingYear.toStringDisplay());
            }
        }
    }


    /*Với chức năng tặng voucher khuyến mãi. Cho phép người dùng nhập vào số lượng voucher khuyến mãi 10%,
    số lượng voucher khuyến mãi 20%, số lượng voucher khuyến mãi 50%,
     hệ thống sẽ lấy danh sách các khách hàng đã booking trong tháng hiện tại sắp xếp theo thứ tự booking và đẩy vào Stack
      (số lượng khách hàng = tổng số lượng voucher) sau đó tiến hành hiển thị danh sách khách hàng sẽ tặng voucher
      (các khách hàng đặt theo thứ tự muộn nhất sẽ nhận 10%, hết 10% mới sử dụng 20%, hết 20% mới được sử dụng 50%)
     */
    @Override
    public void displayCustomerListGetVoucher() {
        //chuyển dữ liệu từ list booking theo năm từ TreeSet --> Stack để phát voucher, vì người MUỘN nhất nhận voucher trước
        //mà danh sách TreeSet xếp từ sớm đến muộn nên dùng Stack (FILO)
        Stack<Booking> bookingVoucherStackList = new Stack<>();

        //đầu tiên kiểm tra danh sách theo năm có trống hay không
        if (getBookingListYear().isEmpty()) {
            System.out.println("No data!!!");
            return;
        }

        //chuyển TreeSet qua Stack
        for (Booking booking : getBookingListYear()) {
            bookingVoucherStackList.push(booking);
        }

        System.out.println("----------VOUCHER----------");
        //hiện số lượng người cần phát voucher
        System.out.println("total booking voucher: " + bookingVoucherStackList.size());
        System.out.println();

        //nhập tổng số voucher 10%, 20%, 50% sao cho tổng voucher = tổng danh sách trong list
        int voucher10;
        int voucher20;
        int voucher50;
        try {
            do {
                System.out.print("Enter number voucher 10%: ");
                voucher10 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number voucher 20%: ");
                voucher20 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter number voucher 50%: ");
                voucher50 = Integer.parseInt(scanner.nextLine());
            } while ((voucher10 + voucher20 + voucher50) != bookingVoucherStackList.size());

            //tiến hành phát voucher và hiện danh sách được phát voucher
            while (!(bookingVoucherStackList.isEmpty())) {
                //phát voucher 10% trước sau đó 20, 50
                if (voucher10 != 0) {
                    System.out.println("- VOUCHER 10% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher10--;
                } else if (voucher20 != 0) {
                    System.out.println("- VOUCHER 20% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher20--;
                } else {
                    System.out.println("- VOUCHER 50% to " + bookingVoucherStackList.pop().toStringDisplay());
                    voucher50--;
                }
            }
            return;
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return;
    }


}
