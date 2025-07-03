import java.util.Scanner;

public class multiple05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
