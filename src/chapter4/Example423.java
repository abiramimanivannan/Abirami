package chapter4;

import java.util.Scanner;

public class Example423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int array[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		System.out.println("Enter the element of the array");
		
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		
        int large=array[0];
        int secLarge=array[0];
        for(int i=0;i<size;i++){
        	if(array[i]>large){
        		secLarge=large;
        		large=array[i];
        	}
        	else if(array[i]>secLarge){
        		secLarge=array[i];
        		
  
        	}
        	
        }
        System.out.println("the first largest element is:"+large);
        System.out.println("The second largest element is :"+secLarge);
         
	}

}
