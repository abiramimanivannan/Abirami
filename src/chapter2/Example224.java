package chapter2;

import java.util.Scanner;

public class Example224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the 1st integer");
//		int a=scanner.nextInt();
//		System.out.println("Enter the 2nd integer");
//		int b=scanner.nextInt();
//		System.out.println("Enter the 3rd integer");
//		int c=scanner.nextInt();
//		System.out.println("Enter the 4th integer");
//		int d=scanner.nextInt();
//		System.out.println("Enter the 5th integer");
//		int e=scanner.nextInt();
////		if(a > b && a > c && a > d && a > e){
//			System.out.println(a+"is larger");
//		}
//		else if(b > c && b > d && b > e){
//			System.out.println(b+"is larger");
//		}
//		else if(c > d && c > e){
//			System.out.println(c+"is larger");
//		}
//		else if(d > e){
//			System.out.println();
//		}
		int large=0;
		int small=0;
		
		System.out.println("Enter the number of integers");
		int n=scanner.nextInt();
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++){
			int number=scanner.nextInt();
			if(number>large){
				large=number;
			}
			
		}
		System.out.println(large+" is larger");
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++){
			int number=scanner.nextInt();
			if(i==0&&number>0){
				small=number;
			}
			if(number<small){
				small=number;
			}
			
		}
		System.out.println(small+" is smaller");



		scanner.close();
	}

}
