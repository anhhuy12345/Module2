package Extend_Exercise_Two.Model;

public class Person {
    private String idCustomer;
    private String name;

    public Person(String idCustomer, String name) {
        this.idCustomer = idCustomer;
        this.name = name;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                idCustomer + "," +
                        name + ",";
    }
}
