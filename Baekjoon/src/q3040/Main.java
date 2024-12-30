package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] hatNum = new int[9];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			hatNum[i] = scan.nextInt();
			sum += hatNum[i];
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j < 9; j++) {
				if(sum-hatNum[i]-hatNum[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
						}
						System.out.println(hatNum[k]);
					}
					scan.close();
					return;
				}
			}
		}
	}

}
