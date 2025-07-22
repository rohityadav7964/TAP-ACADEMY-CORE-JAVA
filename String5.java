import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        int index = str.lastIndexOf(ch);

        System.out.println(index);
    }
}
