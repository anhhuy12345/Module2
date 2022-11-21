package Exam2;

import java.io.IOException;

public class InvalidFormatCGNameException extends IOException {
    public InvalidFormatCGNameException(){

    }
    public  InvalidFormatCGNameException(String messeger){
        super(messeger);
    }
}
