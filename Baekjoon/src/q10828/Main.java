package q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String command;
		int commandNum;
		
		Stack stack = new Stack(N);
		for (int i=0; i<N; i++) {
			command = scan.next();
			
			if (command.equals("push")) {
				commandNum = scan.nextInt();
				stack.push(commandNum);
			} else if (command.equals("pop")) {
				stack.pop();
			} else if (command.equals("size")) {
				stack.size();
			} else if (command.equals("empty")) {
				stack.empty();
			} else if (command.equals("top")) {
				stack.top();
			}
		}
		scan.close();
	}

}


class Stack {
	private int ptr = 0;
	private int[] arr;
	
	Stack(int N) { 
		this.arr = new int[N];
	}
	
	public void push(int n) {
		this.arr[this.ptr] = n;
		this.ptr++;
	}

	public void pop() {
		if(this.ptr == 0) {
			System.out.println(-1);
		} else {
			System.out.println(this.arr[--this.ptr]);
		}
	}
	
	public void size() {
		System.out.println(ptr);
	}
	
	public void empty() {
		System.out.println(this.ptr == 0 ? 1 : 0);
	}
	
	public void top() {
		if(this.ptr == 0) {
			System.out.println(-1);
		} else System.out.println(this.arr[this.ptr-1]);
	}
}
