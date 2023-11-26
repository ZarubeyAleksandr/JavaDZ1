public class Robot extends Participant{

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    void run() {
        System.out.println("Робот " + this.getName() + " біжить");
    }

    @Override
    void jump() {
        System.out.println("Робот " + this.getName() + " стрибає");
    }
}
