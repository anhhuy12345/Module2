package Extend_Exercise_Two.Model;

public class Customer {
    private InternationalCustomer internationalCustomer;
    private VietnamCustomer vietnamCustomer;

    public Customer(InternationalCustomer internationalCustomer, VietnamCustomer vietnamCustomer) {
        this.internationalCustomer = internationalCustomer;
        this.vietnamCustomer = vietnamCustomer;
    }

    public InternationalCustomer getInternationalCustomer() {
        return internationalCustomer;
    }

    public void setInternationalCustomer(InternationalCustomer internationalCustomer) {
        this.internationalCustomer = internationalCustomer;
    }

    public VietnamCustomer getVietnamCustomer() {
        return vietnamCustomer;
    }

    public void setVietnamCustomer(VietnamCustomer vietnamCustomer) {
        this.vietnamCustomer = vietnamCustomer;
    }

    @Override
    public String toString() {
        return
                internationalCustomer + "," + vietnamCustomer
                ;
    }
}
