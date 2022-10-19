package Case_Study.Model;

public class Customer extends Person {
    private String address;
    private String customerType;

    public Customer(){}

    public Customer(String id, String name, String birthday, String sex, int indentityCard, int phoneNumber, String email, String address, String customerType){
        super(id, name, birthday, sex, indentityCard, phoneNumber, email);
        this.address = address;
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String toStringPerson() {
        return "Customer: " + super.toStringPerson() +
                "Address: " + address +"\n"+
                "Customer Type: " + customerType;
    }
}
