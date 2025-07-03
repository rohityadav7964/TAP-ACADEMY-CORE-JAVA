import java.util.Scanner;

public class Arreystuheight {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n = Scan.nextInt();
		float[] a = new float[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the height of " + (i + 1) + "student");
			a[i] = Scan.nextFloat();
		}
		System.out.println("The height of students are:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Scan.close();
	}

}