package Case_Study.Model;

public class Room extends Facility {
    private String serviceFreeRoom;

    //constructor

    public Room() {
    }

    public Room(String idFacility, String name, double area, double cost, int maxPeople, String rentType, String serviceFreeRoom) {
        super(idFacility, name, area, cost, maxPeople, rentType);
        this.serviceFreeRoom = serviceFreeRoom;
    }

    //getter setter

    public String getServiceFreeRoom() {
        return serviceFreeRoom;
    }

    public void setServiceFreeRoom(String serviceFreeRoom) {
        this.serviceFreeRoom = serviceFreeRoom;
    }

    //xuất thông tin

    @Override
    public String toStringDisplay() {
        return "Room{" + super.toStringDisplay() + "," +
                "serviceFreeRoom='" + serviceFreeRoom + '\'' +
                '}';
    }
    //dùng cho file CSV

    @Override
    public String toString() {
        return super.toString() + "," + serviceFreeRoom;
    }
}

