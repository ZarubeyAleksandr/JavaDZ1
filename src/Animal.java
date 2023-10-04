public class Animal {
    public String name;
    private int maxRun;
    private int maxSwim;
    private static int totalAnimals = 0;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public void run(int distance) {
        if (distance > 0 && distance <= maxRun) {
            System.out.println(name + " пробіг " + distance + " м");
        } else if (distance <= 0){
            System.out.println(name + " не може пробігти від'ємну відстань");
        } else {
            System.out.println(name + " не може пробігти " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance > 0 && distance <= maxSwim) {
            System.out.println(name + " проплив " + distance + " м");
        } else if (distance <= 0){
            System.out.println(name + " не може пропливти від'ємну відстань");
        } else {
            System.out.println(name + " не може пропливти " + distance + " м");
        }
    }

}
