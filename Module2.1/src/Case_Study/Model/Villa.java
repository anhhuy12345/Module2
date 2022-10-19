package Case_Study.Model;

public class Villa extends Facility {
    private String standard;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String idFacility, String name, double area, Double cost, int maxPeople, String rentalType, String standard, double areaPool,int floor) {
        super(idFacility, name, area, cost, maxPeople, rentalType);
        this.standard = standard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toStringDisplay() {
        return "Villa{" + super.toStringDisplay() + "," +
                "standardRoomVilla: " + standard + " " +
                ", areaPool: " + areaPool + " "+
                ",floor: " + floor;
    }
}
