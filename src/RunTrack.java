public class RunTrack extends Obstacle {

    public RunTrack(String name, int value) {
        super(name, value);
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxRunDistance() >= value) {
            System.out.println("Учасник " + participant.getName() + " пробіг " + value + "м");
            return true;
        } else {
            System.out.println("Учасник " + participant.getName() + " не зміг пробігти " + value + "м");
            return false;
        }
    }
}
