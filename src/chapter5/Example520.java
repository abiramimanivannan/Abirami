package chapter5;

public class Example520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0.0;
		boolean add = true;
		final int MAX = 200000; // try changing this to, say, 1,000,000

		for (int i = 1; i <= MAX; i += 2) {
			if (add) {
				pi += 4.0 / i;
			} else {
				pi -= 4.0 / i;
			} // end if/else
			System.out.println("pi = " + pi);
			add = !add;
		} // end for
		System.out.println(pi);
	}

}
