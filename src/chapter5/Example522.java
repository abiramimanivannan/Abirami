package chapter5;

public class Example522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,k;
		for(int i=1;i<=10;i++){
			for(j=1;j<=i;j++){
				System.out.print('*');
			}
			for(k=1;k<=10-i;k++){
				System.out.print(' ');
			}
			System.out.print("\t");
			for(j=10;j>=i;j--){
				System.out.print('*');
			}
			for(k=1;k<i;k++){
				System.out.print(' ');
			}
			System.out.print("\t");
			for(k=1;k<i;k++){
				System.out.print(' ');
			}
			for(j=10;j>=i;j--){
				System.out.print('*');
			}
			System.out.print("\t");
			for( k=10;k>i;k--){
				System.out.print(' ');
			}
			for(j=1;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		

	}

}
