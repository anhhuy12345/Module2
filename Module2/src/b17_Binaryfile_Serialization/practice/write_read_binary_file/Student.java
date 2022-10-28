package b17_Binaryfile_Serialization.practice.write_read_binary_file;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;

    private String name;

    private String address;

    private boolean sex;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                '}';
    }
}
