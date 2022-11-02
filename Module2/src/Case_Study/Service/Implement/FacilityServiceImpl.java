package Case_Study.Service.Implement;

import Case_Study.Model.Facility;
import Case_Study.Model.Room;
import Case_Study.Model.Villa;
import Case_Study.Service.FacilityService;
import Case_Study.Ultil.ReadAndWrite;
import Case_Study.Ultil.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {

    //-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
    public static final String REGEX_STR = "[A-Z][a-z]+";

    //-	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //-	Nếu là Villa thì XX sẽ là VL
    //-	Nếu Room thì XX sẽ là RO
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";

    //-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    //-	Số lượng người tối đa phải >0 và nhỏ hơn <20
    public static final String REGEX_PERSON = "^[1-9]||([1][0-9])|(20)$";

    //số tiền
    public static final String REGEX_INT = "^[1-9]|([1][0-9]$)";

    //Khởi tạo list Hasp Map lưu trữ cơ sở
    // Key: cơ sở nào
    // value: số lần sử dụng
    private Scanner scanner = new Scanner(System.in);

    //đường link CSV và HEADER
    public static final String PATH_ROOM = "E:\\Codegym\\Module2\\src\\Case_Study\\Data\\FacilityCSV\\Room.csv";
    public static final String HEADER_ROOM = "idFacility, name, area, cost, maxPeople, rentType, standardRoomHouse, numberFloorHouse, USED";
    public static final String PATH_VILLA = "E:\\Codegym\\Module2\\src\\Case_Study\\Data\\FacilityCSV\\Villa.csv";
    public static final String HEADER_VILLA = "idFacility, name, area, cost, maxPeople, rentType, standardRoomVilla, areaPool, numberFloorVilla, USED";

    //khai báo đọc ghi file CSV
    ReadAndWrite<String> roomReadAndWrite = new ReadAndWrite<>();
    ReadAndWrite<String> villaReadAndWrite = new ReadAndWrite<>();

    //đọc file để lấy list ROOM
    public Map<Room, Integer> getListRoom() {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        List<String> stringListRoom = roomReadAndWrite.readFromFile(PATH_ROOM);
        for (String room : stringListRoom) {
            String[] roomArray = room.split(",");
            roomList.put(new Room(roomArray[0], roomArray[1], Double.parseDouble(roomArray[2]), Double.parseDouble(roomArray[3]), Integer.parseInt(roomArray[4]), roomArray[5], roomArray[6]), Integer.parseInt(roomArray[7]));
        }
        return roomList;
    }

    //đọc file để lấy list VILLA
    public Map<Villa, Integer> getListVilla() {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        List<String> stringListVilla = villaReadAndWrite.readFromFile(PATH_VILLA);
        for (String villa : stringListVilla) {
            String[] villaArray = villa.split(",");
            villaList.put(new Villa(villaArray[0], villaArray[1], Double.parseDouble(villaArray[2]), Double.parseDouble(villaArray[3]), Integer.parseInt(villaArray[4]), villaArray[5], villaArray[6], Double.parseDouble(villaArray[7]), Integer.parseInt(villaArray[8])), Integer.parseInt(villaArray[9]));
        }
        return villaList;
    }

    //hiển thị list để truyền dữ liệu, đọc file
    public Map<Facility, Integer> getListFacility() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        facilityList.putAll(getListRoom());
        facilityList.putAll(getListVilla());
        return facilityList;
    }

    @Override
    public void display() {
        Map<Facility, Integer> facilityList = getListFacility();
        //sử dụng entrySet để duyệt các phần tử trong list Map
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            System.out.println("Facility: " + element.getKey().toStringDisplay() + " USED " + element.getValue() + " times");
        }
    }

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> facilityList = getListFacility();
        //hiển thị danh sách cần bảo trì
        System.out.println("-----LIST Facility need maintenance-----");
        for (Map.Entry<Facility, Integer> element : facilityList.entrySet()) {
            if (element.getValue() >= 5) { // 5
                System.out.println("Facility: " + element.getKey().toStringDisplay() + " USED " + element.getValue() + " times");
            }
        }
    }


    //Nhập villa theo regex
    //Nhập id Villa theo regex
    private String inputIdVilla() {
        System.out.print("Input name id Facility Villa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "ERROR REGEX id villa! REGEX: SVVL-YYYY");
    }

    private String inputNameVilla() {
        System.out.print("Input name Villa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "ERROR REGEX Name villa!");
    }

    private String inputAreaVilla() {
        System.out.print("Input area Villa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "ERROR REGEX Area villa!");
    }

    private String inputCostVilla() {
        System.out.print("Input cost Villa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "ERROR REGEX Cost villa!");
    }

    @Override
    public void addNewVilla() {
        //đọc file lấy list villa
        Map<Villa, Integer> listVilla = getListVilla();
        try {
            //nhập thông tin Villa
            String idFacility = inputIdVilla();

            String name = inputNameVilla();

            double area = Double.parseDouble(inputAreaVilla());

            double cost = Double.parseDouble(inputCostVilla());

            System.out.print("Input max People Villa: ");
            int maxPeople = Integer.parseInt(scanner.nextLine());

            System.out.print("Input rent Type Villa: ");
            String rentType = scanner.nextLine();

            System.out.print("Input standard Room Villa: ");
            String standardRoom = scanner.nextLine();

            System.out.print("Input area Pool Villa: ");
            double areaPool = Double.parseDouble(scanner.nextLine());

            System.out.print("Input number Floor Villa: ");
            int numberFloor = Integer.parseInt(scanner.nextLine());

            //tạo đối tượng Villa
            Villa villa = new Villa(idFacility, name, area, cost, maxPeople, rentType, standardRoom, areaPool, numberFloor);

            //bỏ đối tượng vào Map List:
            // Key: cơ sở nào
            //value: số lần sử dụng
            listVilla.put(villa, 0);
            //ghi vào file villa.csv
            //đọc key, value vào 1 list
            List<String> stringList = new ArrayList<>();
            for (Map.Entry<Villa, Integer> element : listVilla.entrySet()) {
                stringList.add(element.getKey().toString() + "," + element.getValue().toString());
            }

            villaReadAndWrite.writeToFile(stringList, PATH_VILLA, HEADER_VILLA);
            return;
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return;
    }

    @Override
    public void addNewRoom() {
        Map<Room, Integer> listRoom = getListRoom();
        try {
            //nhập thông tin Room
            System.out.print("Input name id Facility Room: ");
            String idFacility = scanner.nextLine();

            System.out.print("Input name Room: ");
            String name = scanner.nextLine();

            System.out.print("Input area Room: ");
            double area = Double.parseDouble(scanner.nextLine());

            System.out.print("Input cost Room: ");
            double cost = Double.parseDouble(scanner.nextLine());

            System.out.print("Input max People Room: ");
            int maxPeople = Integer.parseInt(scanner.nextLine());

            System.out.print("Input rent Type Room: ");
            String rentType = scanner.nextLine();

            System.out.print("Input service Free Room: ");
            String serviceFreeRoom = scanner.nextLine();

            //tạo đối tượng Room
            Room room = new Room(idFacility, name, area, cost, maxPeople, rentType, serviceFreeRoom);

            //bỏ đối tượng vào Map List:
            // Key: cơ sở nào
            //value: số lần sử dụng
            listRoom.put(room, 0);
            List<String> stringList = new ArrayList<>();
            for (Map.Entry<Room, Integer> element : listRoom.entrySet()) {
                stringList.add(element.getKey().toString() + "," + element.getValue().toString());
            }

            roomReadAndWrite.writeToFile(stringList, PATH_ROOM, HEADER_ROOM);

            return;
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return;
    }

    @Override
    public void addNew() {
    }

    @Override
    public void edit() {
    }

    @Override
    public void delete() {

    }
}
