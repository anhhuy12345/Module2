package Case_Study.Model;

public class Room extends Facility {
    private String freeService;

    public Room(){}

    public Room(String idFacility, String name, double area, Double cost, int maxPeople, String rentalType,String freeService){
        super(idFacility, name, area, cost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    @Override
    public String toStringDisplay(){
        return "Room: "+ super.toStringDisplay() + " "+
                " Free service" + freeService;
    }
}
