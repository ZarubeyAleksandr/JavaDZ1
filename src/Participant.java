public abstract class Participant {

    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    abstract void run();

    abstract void jump();

}
