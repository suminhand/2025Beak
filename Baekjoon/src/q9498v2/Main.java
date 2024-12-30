package q9498v2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
		}
		scan.close();
	}

}
