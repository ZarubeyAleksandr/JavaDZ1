public class Car {

    private void startElectricity() {
        System.out.println("Запускаємо систему електроживлення");
    }

    private void startCommand() {
        System.out.println("Запускаємо систему управління");
    }

    private void startFuelSystem() {
        System.out.println("Запускаємо паливо");
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}