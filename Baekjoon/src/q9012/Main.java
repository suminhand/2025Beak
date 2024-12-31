package q9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int lineNum;
		String nowPs;
		
		int ptr = 0;
		
		Scanner scan = new Scanner(System.in);
		lineNum = scan.nextInt();
		
		for (int i = 0; i < lineNum; i++) {
			nowPs = scan.next();
			for (int j = 0; j < nowPs.length(); j++) {
				if (nowPs.charAt(j) == '(') {
					ptr++;
				} else if(nowPs.charAt(j) == ')') {
					ptr--;
					if(ptr == -1) {
						break;
					}
				}
			}
			if(ptr != 0) {
				System.out.println("NO");
			} else System.out.println("YES");
			ptr = 0;
		}
		
		scan.close();

	}

}
