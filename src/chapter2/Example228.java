package chapter2;

import java.util.Scanner;

public class Example228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius");
		int rad=scanner.nextInt();
		float pi=3.14159f;
		System.out.printf("\ndiameter = %d ", (2*rad));
		System.out.printf("\ncircumference = %f ", (2*pi*rad));
		System.out.printf("\narea = %f ",(pi*rad*rad));
		scanner.close();

	}

}
