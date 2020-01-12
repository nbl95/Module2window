package Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "tao la ga day cuc ctac...";
    }

    @Override
    public String howToEat() {
        return "kfc";
    }
}