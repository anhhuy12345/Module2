package Extend_Exercise_Two.Model;

public class Invoice {
    private String idInvoike;
    private String billDay;
    private String wattage;
    private double coast;
    private double money;
    private InternationalCustomer internationalCustomer;
    private VietnamCustomer vietnamCustomer;

    public Invoice(String idInvoike, String billDay, String wattage, double coast, double money, InternationalCustomer internationalCustomer, VietnamCustomer vietnamCustomer) {
        this.idInvoike = idInvoike;
        this.billDay = billDay;
        this.wattage = wattage;
        this.coast = coast;
        this.money = money;
        this.internationalCustomer = internationalCustomer;
        this.vietnamCustomer = vietnamCustomer;
    }

    public String getIdInvoike() {
        return idInvoike;
    }

    public void setIdInvoike(String idInvoike) {
        this.idInvoike = idInvoike;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
                idInvoike + "," +
                        billDay + "," +
                        wattage + "," +
                        coast + "," +
                        money + "," +
                        internationalCustomer + "," +
                        vietnamCustomer
                ;
    }
}
