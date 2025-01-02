package q1913;

import java.util.Scanner;

public class Main {
	void goForward(int i, int last, int[][] numMap, int x, int y) {
		if(last <= 0) {
			return;
		}
		numMap[x][y] = i++;
		if (numMap[x][y+1] == 0) {
			goRight(i, --last, numMap, x, y+1);
		} else goForward(i, --last, numMap, x-1, y);
	}
	
	void goRight(int i, int last, int[][] numMap, int x, int y) {
		if(last <= 0) {
			return;
		}
		numMap[x][y] = i++;
		if (numMap[x+1][y] == 0) {
			goBackward(i, --last, numMap, x+1, y);
		} else goRight(i, --last, numMap, x, y+1);
	}
	
	void goLeft(int i, int last, int[][] numMap, int x, int y) {
		if(last <= 0) {
			return;
		}
		numMap[x][y] = i++;
		if (numMap[x-1][y] == 0) {
			goForward(i, --last, numMap, x-1, y);
		} else goLeft(i, --last, numMap, x, y-1);
	}
	
	void goBackward(int i, int last, int[][] numMap, int x, int y) {
		if(last <= 0) {
			return;
		}
		numMap[x][y] = i++;
		if (numMap[x][y-1] == 0) {
			goLeft(i, --last, numMap, x, y-1);
		} else goBackward(i, --last, numMap, x+1, y);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int findNum = scan.nextInt();
		scan.close();
		
		int center = N/2;
		int x = center, y = center;
		int[][] numMap = new int[N][N];
		
		Main main = new Main();
		
		numMap[x][y] = 1;
		main.goForward(2, N*N-1, numMap, x-1, y);
		
		for(int n=0; n<N; n++) {
			for (int m=0; m<N; m++) {
				if(numMap[n][m] == findNum) {
					x = n; y = m;
				}
				System.out.print(numMap[n][m] + " ");
			}
			System.out.print("\n");
		}
		System.out.print((x+1) + " " + (y+1));
		

	}

}
