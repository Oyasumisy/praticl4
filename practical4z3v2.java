import java.util.Scanner;

public class practical4z3v2 {
    //Завдання 3; Варіант 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число N для виведення всіх простих чисел від 1 до N: ");
        int n = scanner.nextInt();

        System.out.println("Прості числа від 1 до " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
