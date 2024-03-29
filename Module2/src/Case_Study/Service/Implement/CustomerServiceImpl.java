package Case_Study.Service.Implement;

import Case_Study.Model.Customer;
import Case_Study.Model.Employee;
import Case_Study.Service.CustomerService;
import Case_Study.Ultil.ReadAndWrite;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String PATH = "E:\\Codegym\\Module2\\src\\Case_Study\\Data\\Customer.csv";
    private static final String INPUT_HEADERS ="name, dateOfBirth, sex, id, phoneNumber, email, address, idCustomer, rankCustomer" ;

    //khai báo đọc ghi file CSV
    ReadAndWrite<Customer> customerReadAndWrite = new ReadAndWrite<>();

    //hiển thị list để truyền dữ liệu
    public LinkedList<Customer> getListCustomer() {
        //khởi tạo list customer
        LinkedList<Customer> customerLinkedList = new LinkedList<>();
        List<String> stringList = customerReadAndWrite.readFromFile(PATH);
        for (String customerString : stringList) {
            //vì các thuộc tính trong file CSV được ngăn cách bởi dấu ","
            String[] stringProperty = customerString.split(",");
            customerLinkedList.add(new Customer(stringProperty[0], stringProperty[1], stringProperty[2],
                    stringProperty[3], Integer.parseInt(stringProperty[4]), stringProperty[5],
                    stringProperty[6], stringProperty[7], stringProperty[8]));
        }
        return customerLinkedList;
    }

    //khai báo scanner để người dùng nhập vào thông tin
    Scanner scanner = new Scanner(System.in);

    //tạo đối tượng customer
    public Customer inputCustomer() {
        try {
            System.out.print("input name Customer: ");
            String name = scanner.nextLine();

            System.out.print("input dateOfBirth Customer: ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("input sex Customer: ");
            String sex = scanner.nextLine();

            System.out.print("input id(cmnd) Customer: ");
            String id = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input phoneNumber Customer: ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("input email Customer: ");
            String email = scanner.nextLine();

            System.out.print("input address Customer: ");
            String address = scanner.nextLine();

            System.out.print("input id customer: ");
            String idCustomer = scanner.nextLine();

            // rankCustomer: Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).
            System.out.print("input rank customer: ");
            String rankCustomer = scanner.nextLine();

            return new Customer(name, dateOfBirth, sex, id, phoneNumber, email, address, idCustomer, rankCustomer);
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void addNew() {
        LinkedList<Customer> customerLinkedList = getListCustomer();
        customerLinkedList.add(inputCustomer());
        //ghi vào file
        customerReadAndWrite.writeToFile(customerLinkedList, PATH, INPUT_HEADERS);

    }

    @Override
    public void display() {
        LinkedList<Customer> customerLinkedList = getListCustomer();
        if(getListCustomer().size()==0){
            System.out.println("No data!!!!");
        }else {
            //xoá những đối tượng bị null
            while (customerLinkedList.contains(null)) {
                customerLinkedList.remove(null);
            }

            System.out.println("\n----------List Customer----------");
            for (Customer customer : customerLinkedList) {
                System.out.println(customer.toStringDisplay());
            }
        }
    }

    @Override
    public void edit() {
        LinkedList<Customer> customerLinkedList = getListCustomer();
        boolean check = true;
        if (getListCustomer().size()== 0) {
            System.out.println("No data!!!!");
        } else {
            //hiển thị lại list Customer
            display();

            System.out.print("input id element update: ");
            String idCustomer = scanner.nextLine();
            for (int i = 0; i < customerLinkedList.size(); i++) {
                if (idCustomer.equals(customerLinkedList.get(i).getId())) {
                    //xuất lại thông tin cũ
                    System.out.println(customerLinkedList.get(i).toStringDisplay());
                    //edit lại thông tin
                    customerLinkedList.set(i, inputCustomer());
                    check = false;
                }
            }
            //ghi vào file
            customerReadAndWrite.writeToFile(customerLinkedList, PATH, "name, dateOfBirth, sex, id, phoneNumber, email, address, idCustomer, rankCustomer");
            if (check) {
                System.out.println("NOT FIND ID!");
            }
        }
    }

    @Override
    public void delete() {
        List<Customer> customerList = getListCustomer();

        if(getListCustomer().size() == 0){
            System.out.println("No data!!!!");
        }else {
            boolean check = true;
            //hiển thị lại danh sách employee
            display();

            System.out.print("input id you want delete: ");
            String idEmployee = scanner.nextLine();
            for (int i = 0; i < customerList.size(); i++) {
                if (idEmployee.equals(customerList.get(i).getId())) {
                    System.out.println("Your id will be permanently removed from the list");
                    System.out.println(customerList.remove(i));
                    this.customerReadAndWrite.writeToFile(customerList, PATH, INPUT_HEADERS, false);
                    return;
                }
            }
        }

    }
}
