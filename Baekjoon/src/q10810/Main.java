package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int NNum = scan.nextInt();
		int[] N = new int[NNum];
		int M = scan.nextInt();
		
		int start, end, ballNum;
		for (int i=0; i<M; i++) {
			start = scan.nextInt() - 1;
			end = scan.nextInt();
			ballNum = scan.nextInt();
			
			for (int j=start; j<end; j++) {
				N[j] = ballNum;
			}
		}
		
		for (int i=0; i<NNum; i++) {
			System.out.print(N[i] + " ");
		}

	}

}
