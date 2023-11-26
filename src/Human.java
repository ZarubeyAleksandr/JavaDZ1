public class Human extends Participant {
    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    void run() {
        System.out.println("Людина " + this.getName() + " біжить");
    }

    @Override
    void jump() {
        System.out.println("Людина " + this.getName() + " стрибає");
    }

}
