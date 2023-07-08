package Collatz_Problem;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		while(n!=1) {
			System.out.print(n+" ");
			if(n%2==0) {
				n=n/2;
			}
			else {
				n=(3*n)+1;
			}
		}
		System.out.print(n);
	}

}
