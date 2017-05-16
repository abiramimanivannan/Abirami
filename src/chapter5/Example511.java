package chapter5;

import java.util.Scanner;

public class Example511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of integers");
		int c=scanner.nextInt();
		int num[]=new int[c];
		System.out.println("Enter the integers");
		for(int i=0;i<c;i++){
			 num[i]=scanner.nextInt();
			
		}
		int small=num[0];
		for(int i=0;i>num.length;i++){
		if(num[i]<small){
			small=num[i];
		}
		

	}
		System.out.println(small+"is smaller");

}
}