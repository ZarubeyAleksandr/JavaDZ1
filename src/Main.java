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
                new Cats("Barsik>", 150, 3),
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
        /*
        //************** Lesson 1 ******************
        System.out.println("Hello World!");
        String dz = "First Lesson";
        System.out.println(dz);

         */
        //********** lesson 3 part 1 ****************
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурчик");
        Dog dog1 = new Dog("Бобік");
        cat1.run(150);
        cat2.run(250);
        cat2.swim(2);
        cat1.swim(-1);

        dog1.run(300);
        dog1.run(600);
        dog1.swim(9);
        dog1.swim(11);

        System.out.println("Загальна кількість котів: " + Cat.getTotalCats());
        System.out.println("Загальна кількість собак: " + Dog.getTotalDogs());
        System.out.println("Загальна кількість тварин: " + Animal.getTotalAnimals());
    }

}
