package b7_Abstract_Interface.practice;

import b7_Abstract_Interface.practice.animal.Animal;
import b7_Abstract_Interface.practice.animal.Chicken;
import b7_Abstract_Interface.practice.animal.Tiger;
import b7_Abstract_Interface.practice.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for(Animal animal:animals) { //for each
            System.out.println(animal.makeSound());
        }

//        if ( animals[1] instanceof Chicken ){
        System.out.println( ((Chicken) animals[1]).howToEat());
//        }
//       Chicken chicken=new Chicken();
//        System.out.println(chicken.howToEat());
    }
}
