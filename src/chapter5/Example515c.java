package chapter5;

public class Example515c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			for(int j=1;j<i+1;j++)
				System.out.print(' ');
			
			for(int k=10;k>i;k-- )
				System.out.print("*");
			
			System.out.println();
		}

	}

}
