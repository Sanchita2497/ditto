package www.rays.com;

public class Firstlargest {
	public static void main(String[] args) {
		int [] a = {56, 9, 41, 24, 879, 30};
		int b = a [0];
		for (int i = 0; i < a.length; i++){
			if (a [i] > b ) {
				b = a[i];
			}
		}
		System.out.println("Largest no is:" + b);
	}

}
