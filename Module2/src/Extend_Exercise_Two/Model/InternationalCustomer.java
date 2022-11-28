package Extend_Exercise_Two.Model;

public class InternationalCustomer extends Person {
    private String nationality;
    private String string;


    public InternationalCustomer(String idCustomer, String name, String nationality, String string) {
        super(idCustomer, name);
        this.nationality = nationality;
        this.string = string;


    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return super.toString() +
                nationality+ ","+ string;
    }
}
