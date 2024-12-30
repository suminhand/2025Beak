package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2, n3;
		int r1, r2, r3, result;
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		n1 = num2 % 10;
		n2 = (num2 % 100) / 10;
		n3 = num2 / 100;
		
		r1 = num1 * n1;
		r2 = num1 * n2;
		r3 = num1 * n3;
		result = r1 + (r2 * 10) + (r3 * 100);
				
		System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + result);
		scan.close();
	}

}
