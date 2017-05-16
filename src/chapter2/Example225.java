package chapter2;

import java.util.Scanner;

public class Example225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		if(number % 2 ==0){
			System.out.println(number+" is even");
		}
		else{
			System.out.println(number+" is odd");
		}
		System.out.println("Enter");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=a % b;
		if(c ==0){
			System.out.println("Multiplies of second");
		}
		else{
			System.out.println("Not a Multiple");
		}
		scanner.close();

	}

}
