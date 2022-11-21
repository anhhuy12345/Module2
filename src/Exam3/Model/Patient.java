package Exam3.Model;

public class Patient extends Person {
    private String birthDay;
    private String VIP;

    public Patient() {
    }

    public Patient(String id, String name, String sex, String birthDay, String VIP) {
        super(id, name, sex);
        this.birthDay = birthDay;
        this.VIP = VIP;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString()+
                "birthDay='" + birthDay + '\'' +
                ", VIP='" + VIP + '\'' +
                '}';
    }
}
