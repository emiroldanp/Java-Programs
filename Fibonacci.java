import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int c = in.nextInt();
		int f_1 = 0;
		int f_2 = 1;
		System.out.println(f_1);
		System.out.println(f_2);

		for (int i=2; i<c; i++) {
			int f_3 = f_1 + f_2;
			System.out.println(f_3);
			f_1 = f_2;
			f_2 = f_3;
		}
	}
}