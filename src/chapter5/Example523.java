package chapter5;

public class Example523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=6;
		int a=2,b=3;
		int i=2,j=7,g=9;
		if(!( x < 5 ) && !( y >= 7 )==!( ( x < 5 ) || ( y >=7 ) )){
			System.out.println("Equal");
		}
		else{
			System.out.println("not equal");
		}
		if(!( a == b ) || !( g != 5 )==!((a == b) && (g != 5))){
			System.out.println("equivalent");
		}
		else{
			System.out.println("not");
		}
		if(!( ( x <= 8 ) && ( y > 4 ) )==!(x <= 8) || !(y > 4)){
			System.out.println("Equal");
		}
		else{
			System.out.println("not equal");
		}
		if(!( ( i > 4 ) || ( j <= 6 ) )==!(i > 4) && !( j<=6)){
			System.out.println("Equal");
		}
		else{
			System.out.println("not");
		}

	}

}
