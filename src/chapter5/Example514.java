package chapter5;

public class Example514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int p=10000;
		int n=2;
		int t=5;
		for(int r=5;r<=10;r++){
		a=p * ( 1 + (r/n) ) ^ (n*t);
		System.out.println(r+" % is "+a);
		}

	}

}
