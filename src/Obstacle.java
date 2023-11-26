public abstract class Obstacle {

    String name;
    int value;

    public Obstacle(String name, int value) {
        this.name = name;
        this.value = value;
    }

    abstract boolean overcome(Participant participant);
}
