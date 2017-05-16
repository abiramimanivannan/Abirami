package chapter4;

import java.util.Scanner;

public class Example437 {
//	public static int fact(int n){
//		if(n==0){
//			return 1;
//		}
//		else{
//			return n*fact(n-1);
//		}
//		
//	}
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
//	//Example437 f=new Example437();
//	System.out.println(fact(n));
	int fact=1;
	if(n==0){
		System.out.println(fact);
	}
	else{
		
	for(int i=1;i<=n;i++){
		fact=fact*i;
	}
	System.out.println(fact);
	

	}

}
}