package chapter2;

import java.util.Scanner;

public class Example216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first integer");
		int a=scanner.nextInt();
		System.out.println("Enter the second integer");
		int b=scanner.nextInt();
		if(a > b){
			System.out.println(a+" is larger");
		}
		else{
			System.out.println(b+" is larger");
		}
		if(a==b){
			System.out.println(a+" "+b+" these numbers are equal");
		}
		scanner.close();
	}

}
