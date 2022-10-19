package Case_Study.Model;

public abstract class Facility {
    private String idFacility;
    private String name;
    private double area;
    private double cost;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idFacility, String name, double area, Double cost, int maxPeople, String rentalType) {
        this.idFacility = idFacility;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String toStringDisplay() {
        return "id Facility " + idFacility + " " +
                "Name " + name + " " +
                "Area " + area + " " +
                "Cost " + cost + " " +
                "Max People "+ maxPeople+ " "+
                " Rental Type "+ rentalType;

    }
}
