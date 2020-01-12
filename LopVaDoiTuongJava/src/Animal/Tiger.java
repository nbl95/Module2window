package Animal;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "tao la ho day gao o tuc mi cap cha le...";
    }

    @Override
    public String howToEat() {
        return "so difficult";
    }
}