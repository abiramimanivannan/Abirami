package chapter5;

import java.util.Scanner;

public class Example59b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=scanner.nextInt();
		switch (value % 2) {
		case 0:
			System.out.println("Even integer");
			break;
			
			
		case 1:
			System.out.println("Odd Integer");
			break;

		default:
			break;
		}

	}

}
