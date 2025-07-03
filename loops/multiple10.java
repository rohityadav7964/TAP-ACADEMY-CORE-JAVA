import java.util.Scanner;

public class multiple10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 10 == 0) {
            System.err.println("Yes");
        } else {
            System.err.println("No");
        }
        scanner.close();

    }

}
