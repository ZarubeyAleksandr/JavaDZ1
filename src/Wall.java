public class Wall extends Obstacle {

    public Wall(String name, int value) {
        super(name, value);
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxJumpHeight() >= value){
            System.out.println("Учасник " + participant.getName() + " перестрибнув стіну висотою " + value + " метрів");
            return true;
        } else {
            System.out.println("Учасник " + participant.getName() + " не зміг перестрибнути стіну висотою " + value + " метрів");
            return false;
        }

    }
}
