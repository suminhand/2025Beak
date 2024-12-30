package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int new_room = 6;
		int room = 1;
		int road = 1;
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if (N == 1) {
			System.out.println(1);
		} else {
			while(N > room) {
				room += new_room;
				new_room += 6;
				road += 1;
			}
			System.out.println(road);
		}
		scan.close();
	}

}
