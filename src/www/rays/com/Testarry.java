package www.rays.com;

public class Testarry {
	public static void main(String[] args) {
		int [] a = {5, 6, 7, 22, 42};
		System.out.println(a[0] + "  " + a [1]);
		for (int b : a) {
			System.out.println(b);
		}
		
		//for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a [i]);
		}
	}

}
