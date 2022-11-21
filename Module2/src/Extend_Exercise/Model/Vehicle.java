package Extend_Exercise.Model;

public abstract class Vehicle {
    private String licensePlate;
    private String manufacture;
    private String year;
    private String boss;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String manufacture, String year, String boss) {
        this.licensePlate = licensePlate;
        this.manufacture = manufacture;
        this.year = year;
        this.boss = boss;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return
                licensePlate + "," +
                        manufacture + "," +
                        year + "," +
                        boss + ",";
    }

    //Polymorphism: override,
//    public String toStringDisplay(){
//       return  "Liscense plate = "+ licensePlate +
//                "ManuFacture = "+manufacture+
//                "Year = "+ year+
//                "Boss = "+boss;
//    }

}
