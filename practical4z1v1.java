import java.util.Scanner;

public class practical4z1v1 {
    //Завдання 1; Варіант 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 7, щоб дізнатися день тижня: ");
        int day = scanner.nextInt();

        // Використання if-else
        if (day < 1 || day > 7) {
            System.out.println("Невірне число. Введіть число від 1 до 7.");
        } else {
            // Використання switch-case
            switch (day) {
                case 1 -> System.out.println("Понеділок");
                case 2 -> System.out.println("Вівторок");
                case 3 -> System.out.println("Середа");
                case 4 -> System.out.println("Четвер");
                case 5 -> System.out.println("П'ятниця");
                case 6 -> System.out.println("Субота");
                case 7 -> System.out.println("Неділя");
            }
        }

        scanner.close();
    }
}
