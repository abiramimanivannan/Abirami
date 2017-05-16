package chapter2;

import java.util.Scanner;

public class Example217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=scanner.nextInt();
		System.out.println("Enter the 2nd number");
		int b=scanner.nextInt();
		System.out.println("Enter the 3rd number");
		int c=scanner.nextInt();
		int sum = a+b+c;
		int avg=sum/3;
		int product=a*b*c;
		System.out.println("sum of three numbers ="+sum);
		System.out.println("Average ="+avg);
		System.out.println("product of three numbers="+product);
		if(a > b && a > c){
			System.out.println(a+" is larger");
		}
		else if( b > c){
			System.out.println(b+" is larger");
		}
		else{
			System.out.println(c+" is larger");
		}
		if(a < b && a < c){
			System.out.println(a+" is smaller");
		}
		else if( b < c){
			System.out.println(b+" is smaller");
		}
		else{
			System.out.println(c+" is smaller");
		}
		
		scanner.close();
	}

}
