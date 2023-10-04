public class Employee {
    private String pib;
    private String posada;
    private String email;
    private String phone;
    private int vik;

    public Employee(String pib, String posada, String email, String phone, int vik) {
        this.pib = pib;
        this.posada = posada;
        this.email = email;
        this.phone = phone;
        this.vik = vik;
    }

    @Override
    public String toString() {
        return "Співробітник{" +
                "ПІБ='" + pib + '\'' +
                ", Посада='" + posada + '\'' +
                ", Email='" + email + '\'' +
                ", Телефон='" + phone + '\'' +
                ", Вік=" + vik +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Іванов Іван Іванович", "Менеджер", "ivan@google.com", "+380123456789", 35);
        System.out.println(employee);
    }
}
