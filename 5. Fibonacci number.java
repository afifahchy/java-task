import java.util.Scanner;
public class App {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);

        scanner.close();
    }
    public static void printFibonacci(int n) {
        int first = 0, second = 1, next;
          for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }
    }
}