package q1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		scan.close();
		
		int frctnNum = 1;
		int numerator = 1;
		int direct = 0;
		while(true) {
			if (X - frctnNum <= 0) {
				for (; --X>0;) {
					numerator++;
				}
				break;
			}
			X = X - frctnNum++;
			direct = direct==0 ? 1 : 0;
		}
		
		if(direct == 1) {
			System.out.println(numerator + "/" + (frctnNum-numerator+1));
		} else {
			System.out.println((frctnNum-numerator+1) + "/" + numerator);
		}

	}

}
