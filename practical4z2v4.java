import java.util.Random;
import java.util.Scanner;

public class practical4z2v4 {
    //Завдання 2; Варіант 4
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = -1;

        System.out.println("Вгадайте число від 1 до 100: ");

        while (guess != randomNumber) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Загадане число більше: ");
            } else if (guess > randomNumber) {
                System.out.println("Загадане число менше: ");
            }
        }

        System.out.println("Ви вгадали число " + randomNumber + " з " + attempts + " спроб.");
        scanner.close();
    }
}
