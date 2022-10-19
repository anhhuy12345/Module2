package Case_Study.Model;

public class Person {
    private String id;
    private String name;
    private String birthday;
    private String sex;
    private int indentityCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String birthday, String sex, int indentityCard, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.indentityCard = indentityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIndentityCard() {
        return indentityCard;
    }

    public void setIndentityCard(int indentityCard) {
        this.indentityCard = indentityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toStringPerson() {
        return "ID: " + id + "\n" +
                " Name : " + name + "\n" +
                " birthday " + birthday + "\n" +
                "Sex " + sex + "\n" +
                "Indentity Card " + indentityCard + "\n" +
                "Phone number" + phoneNumber + "\n" +
                "Email" + email;
    }
}
