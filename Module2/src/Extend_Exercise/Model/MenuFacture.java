package Extend_Exercise.Model;

public class MenuFacture {
    private String idfacture;
    private String facture;
    private String nation;

    public MenuFacture(String idfacture, String facture, String nation) {
        this.idfacture = idfacture;
        this.facture = facture;
        this.nation = nation;
    }

    public String getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(String idfacture) {
        this.idfacture = idfacture;
    }

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return
                idfacture + "," +
                        facture + "," +
                        nation + ",";
    }
}
