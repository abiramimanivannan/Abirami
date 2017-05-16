package chapter4;

import java.util.Scanner;

public class Example418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the AccNumber");
		int accNumber=scanner.nextInt();
		System.out.println("Enter beginning of the month");
		int begOfTheMonth=scanner.nextInt();
		System.out.println("Enter the charges");
		int charges=scanner.nextInt();
		System.out.println("Enter the credits");
		int credits=scanner.nextInt();
		System.out.println("Enter the credit limit");
		int creditLimit=scanner.nextInt();
		int newBalance=begOfTheMonth+charges-credits;
		System.out.println("New Balance : "+newBalance);
		if(newBalance<creditLimit){
			System.out.println("credit limit exceeded");
		}

	}

}
