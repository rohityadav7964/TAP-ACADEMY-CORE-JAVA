import java.util.Scanner;

public class SubstringFromIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int index = sc.nextInt();

        System.out.println(str.substring(index));
    }
}
