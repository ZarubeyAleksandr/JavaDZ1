public class Cat extends Participant {

    Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }
    @Override
    void run() {
        System.out.println("Кіт " + this.getName() + " біжить");
    }

    @Override
    void jump() {
        System.out.println("Кіт " + this.getName() + " стрибає");
    }
}
