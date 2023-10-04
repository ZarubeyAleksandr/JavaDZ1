public class Main {
    public static void main(String[] args) {
        //********** lesson 1 ****************
        /*
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
