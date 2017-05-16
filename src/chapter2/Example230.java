package chapter2;

public class Example230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=42339;
		String str="";
		while(number>0){
			int a=number%10;
			str=str+String.valueOf(a+"   ");
			number=number/10;
		}
		StringBuilder str1=new StringBuilder(str);
		System.out.println(str1.reverse());
				

	}

}
