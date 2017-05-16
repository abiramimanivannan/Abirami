package chapter5;

import java.util.Scanner;

public class Example516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 5 numbers(1-30)");
		for(int i=0;i<5;i++){
			int num=scanner.nextInt();
			
			for(int j=0;j<num;j++) {
				
				System.out.print("*");
				
				
			}
			System.out.println();
		}
//		int i, j, number;
//	    Scanner input = new Scanner(System.in);
//	    
//	       
//	      System.out.printf("Enter an integer(1-30): ");
//	      
//	     for (i = 0; i < 5; i++)
//	     {
//	        number = input.nextInt();
////	         if(number > 30 || number < 1) 
////	         {
////	             System.out.print("Out of Range Re-Enter");
////	             number = input.nextInt();
////	         }
//	          
//	  
//	        for (j = 1; j <=number; j++) 
//	        {
//	            System.out.printf("*");
//	         }
//	   
//	        System.out.println();

	}

}
