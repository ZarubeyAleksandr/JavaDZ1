public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = {new Circle(6), new Triangle(5, 4), new Square(3)};
        double totalArea = 0;

        for (GeometricFigure figure : figures) {
            totalArea += figure.calculateArea();
        }
        System.out.println("Сумарна площа всіх фігур: " + totalArea);


        Participant[] participants = {
                new Human("Alex", 100, 2),
                new Cat("Barsik>", 150, 3),
                new Robot("R2D2", 200, 4)
        };

        Obstacle[] obstacles = {
                new RunTrack("RunTrack1", 120),
                new Wall("Wall1", 3),
                new RunTrack("RunTrack2", 170),
                new Wall("Wall2", 4)
        };

        for (Participant participant : participants) {
            boolean active = true;
            for (Obstacle obstacle : obstacles) {
                if (active) {
                    active = obstacle.overcome(participant);
                } else {
                    break;
                }
            }
        }
    }

}
