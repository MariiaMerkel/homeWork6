public class Main {
    public static void main(String[] args) {

        System.out.println("task 1:");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName + ".";
        System.out.println(fullName);

        System.out.println("task 2:");
        System.out.println(fullName.toUpperCase());

        System.out.println("task 3:");
        fullName = "Иванов Семён Семёнович";
        String finalFullName = fullName.replace('ё', 'е') + '.';
        System.out.println("Данные Ф. И. О. сотрудника — " + finalFullName);
    }
}