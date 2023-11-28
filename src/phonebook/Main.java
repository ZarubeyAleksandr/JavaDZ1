package phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addRecord(new Record("Максим", "0502233446"));
        phonebook.addRecord(new Record("Олександр", "0730684758"));
        phonebook.addRecord(new Record("Марк", "0673268574"));
        phonebook.addRecord(new Record("Олександр", "0665846591"));

        Record foundRecord = phonebook.find("Олександр");
        if (foundRecord != null) {
            System.out.println("Знайдений запис");
            System.out.println(foundRecord.getName() + ", Телефон: " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Запис не знайдено");
        }

        List<Record> foundRecords = phonebook.findAll("Олександр");
        if (foundRecords != null) {
            System.out.println("Знайдені усі записи з ім'ям: " + foundRecords.getFirst().getName());
            for (Record record : foundRecords) {
                System.out.println("Ім'я: " + record.getName() + ", Телефон: " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Записів не знайдено");
        }


    }
}
