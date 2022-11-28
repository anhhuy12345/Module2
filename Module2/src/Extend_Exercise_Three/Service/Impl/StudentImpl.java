package Extend_Exercise_Three.Service.Impl;


import Extend_Exercise_Three.Model.Student;
import Extend_Exercise_Three.Service.StudentService;
import Extend_Exercise_Three.Util.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentService {
    WriteAndRead<Student> writeAndRead = new WriteAndRead<>();
    private static final String PATH = "E:\\Codegym\\Module2\\src\\Extend_Exercise_Three\\Data\\Student.csv";

    public List<Student> getListStudent() {
        List<String> stringListStudent = writeAndRead.readFromFile(PATH);
        List<Student> studentList = new ArrayList<>();
        for (String student : stringListStudent) {
            String[] studentArray = student.split(",");
            studentList.add(new Student(Integer.parseInt(studentArray[0]), studentArray[1], studentArray[2],
                    studentArray[3], Integer.parseInt(studentArray[4])));
        }
        return studentList;
    }


    @Override
    public void add() {

    }

    @Override
    public void find() {

    }

    @Override
    public void delete() {

    }
}
