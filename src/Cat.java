public class Cat extends Animal {
    private static int totalCats = 0;
    public Cat(String name) {
        super(name, 200, 0);
        totalCats++;
    }

    public static int getTotalCats() {
        return totalCats;
    }
    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не може пропливти від'ємну відстань і взагалі коти не плавають");
        } else {
            System.out.println("Кіт " + name +" не вміє плавати");
        }

    }

}