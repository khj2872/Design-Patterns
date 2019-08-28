package strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("소리 못내");
    }
}
