package Extend_Exercise_Two.Model;

public class VietnamCustomer extends Person {
    private String typeCustomer;
    private String consumptionRate;

    public VietnamCustomer(String idCustomer, String name, String typeCustomer, String consumptionRate) {
        super(idCustomer, name);
        this.typeCustomer = typeCustomer;
        this.consumptionRate = consumptionRate;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getConsumptionRate() {
        return consumptionRate;
    }

    public void setConsumptionRate(String consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                typeCustomer + "," +
                consumptionRate + ",";
    }
}
