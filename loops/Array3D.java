
import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		// user have no idea than message is give:
		System.out.println("Enter the Number of Schools");
		int School = Scan.nextInt();
		// The message is give which is println:
		System.out.println("Enter the Number of Classes");
		int Classes = Scan.nextInt();
		// given the message of terminal
		System.out.println("Enter the Number of Student");
		int Student = Scan.nextInt();

		int[][][] a = new int[2][3][5];
		// school
		for (int i = 0; i < a.length; i++) {// classes
			for (int j = 0; j < a[i].length; j++) {// student
				for (int k = 0; k < a[i][j].length; k++) {// take input
					System.out.println(
							"Enter the age Schools " + (i + 1) + " Classes " + (j + 1) + " Student " + (k + 1));
					a[i][j][k] = Scan.nextInt();
				}

			}
		} // print
			// school
		System.out.println("The number of age:");
		for (int i = 0; i < a.length; i++) {// classes
			for (int j = 0; j < a[i].length; j++) {// student
				for (int k = 0; k < a[i][j].length; k++) {// To print the Arrey take that schools,classes,students:
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

}
