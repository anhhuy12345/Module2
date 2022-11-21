package Extend_Exercise.Util;

public class NotFoundVehicelException extends Exception {
    public NotFoundVehicelException(){

    }
    public NotFoundVehicelException(String message){
        super(message);
    }
}
