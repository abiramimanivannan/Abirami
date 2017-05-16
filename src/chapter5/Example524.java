package chapter5;

public class Example524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			for(int j=3;j>=i;j--){
				System.out.print(' ');
			}
			for(int k=i;k<=i-6;k+=2){
				System.out.print("*");
		}
			System.out.println();

	}

	}
}
