package Case_Study.Service.Implement;

import Case_Study.Model.Employee;
import Case_Study.Service.EmployeeService;
import Case_Study.Ultil.ReadAndWrite;
import Case_Study.Ultil.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    //REGEX ngày sinh dd-MM-yyyy
    private static final String REGEX_BIRTHDAY = "^(?:(?:31(/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String INPUT_HEADERS = "name, dateOfBirth, sex, id, phoneNumber, email, address, idEmployee, level, rank, salary";

    Scanner scanner = new Scanner(System.in);

    //đường link CSV
    private static final String PATH = "E:\\Codegym\\Module2\\src\\Case_Study\\Data\\employee.csv";

    //khai báo đọc ghi file CSV
    ReadAndWrite<Employee> employeeReadAndWrite = new ReadAndWrite<>();

    //tạo đối tượng employee
    public Employee inputEmployee() {
        try {
            System.out.print("input name Employee: ");
            String name = scanner.nextLine();

            System.out.print("input dateOfBirth Employee: ");
            String dateOfBirth = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);

            System.out.print("input sex Employee: ");
            String sex = scanner.nextLine();

            System.out.print("input id(cmnd) Employee: ");
            String id = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input phoneNumber Employee: ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("input email Employee: ");
            String email = scanner.nextLine();

            System.out.print("input address Employee: ");
            String address = scanner.nextLine();

            System.out.print("input id Employee: ");
            String idEmployee = scanner.nextLine();

            //level:         Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
            //rankEmployee:   Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát,
            // quản lý, giám đốc.
            System.out.print("input level Employee: ");
            String level = scanner.nextLine();

            System.out.print("input rank employee: ");
            String rank = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input salary Employee: ");
            double salary = Double.parseDouble(scanner.nextLine());

            return new Employee(name, dateOfBirth, sex, id, phoneNumber, email, address, idEmployee, level, rank, salary);
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    //đọc file CSV để lấy dữ liệu list nhận được
    public List<Employee> getEmployeeList() {
        //đọc file để lấy dữ liệu employee trong file
        List<String> stringList = employeeReadAndWrite.readFromFile(PATH);
        //khai báo chuỗi lưu thông tin nhân viên
        List<Employee> employeeList = new ArrayList<>();
        for (String employeeString : stringList) {
            //vì các thuộc tính trong file CSV được ngăn cách bởi dấu ","
            String[] stringProperty = employeeString.split(",");
            employeeList.add(new Employee(stringProperty[0], stringProperty[1], stringProperty[2], stringProperty[3], Integer.parseInt(stringProperty[4]), stringProperty[5], stringProperty[6], stringProperty[7], stringProperty[8], stringProperty[9], Double.parseDouble(stringProperty[10])));
        }
        return employeeList;
    }

    @Override
    public void addNew() {
        List<Employee> employeeList = getEmployeeList();
        employeeList.add(inputEmployee());
        employeeReadAndWrite.writeToFile(employeeList, PATH, INPUT_HEADERS);
    }

    @Override
    public void edit() {
        List<Employee> employeeList1 = getEmployeeList();
        boolean check1 = true;
        //hiển thị lại danh sách employee
        display();

        System.out.print("input id element update: ");
        String idEmployee1 = scanner.nextLine();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (idEmployee1.equals(employeeList1.get(i).getId())) {
                //xuất lại thông tin cũ
                System.out.println(employeeList1.get(i).toStringDisplay());
                employeeList1.set(i, inputEmployee());
                check1 = false;
            }
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList = getEmployeeList();
        boolean check = true;
        //hiển thị lại danh sách employee
        display();

        System.out.print("input id you want delete: ");
        String idEmployee = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (idEmployee.equals(employeeList.get(i).getId())) {
                System.out.println("Your id will be permanently removed from the list");
                System.out.println(employeeList.remove(i));
                this.employeeReadAndWrite.writeToFile(employeeList, PATH, INPUT_HEADERS, false);
                return;
            }
        }
    }

    @Override
    public void display() {
        List<Employee> employeeList2 = getEmployeeList();
        //xoá những đối tượng bị null
        while (employeeList2.contains(null)) {
            employeeList2.remove(null);
        }

        System.out.println("\n----------List Employee----------");
        for (Employee employee : employeeList2) {
            System.out.println(employee.toStringDisplay());
        }
    }


}
