package b7_Abstract_Interface.practice.animal;

import b7_Abstract_Interface.practice.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Chip Chip!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
