package Extend_Exercise_Two.Model;

public class InternationalCustomer extends Person {
    private String nationality;

    public InternationalCustomer(String idCustomer, String name, String nationality) {
        super(idCustomer, name);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return  super.toString() +
                 nationality ;
    }
}
