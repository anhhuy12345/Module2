package b6_Inheritance.exercise.Point_And_Movepoint.Movepoint;

public class MainMovePoint {
    public static void main(String[] args) {
        MovePoint movePoint = new MovePoint();
        System.out.println(movePoint);
        System.out.println("Move: " + movePoint.move());

        movePoint = new MovePoint(2, 3, 5, 6);
        System.out.println("\n" + movePoint);
        System.out.println("Move: " + movePoint.move());

        movePoint = new MovePoint(1, 2, 4, 5);
        System.out.println("\n" + movePoint);
        System.out.println("Move: " + movePoint.move());

    }
}


