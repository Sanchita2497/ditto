package www.rays.com;

public class Exercise18 {
	public static void main (String[] args) {
		int [] arr = {18, 17, 16, 14, 5, 6, 7, 8};
		int temp = -1;
		for (int i = 0; i < arr.length; i++) {
			if (14== arr[i]) {
				temp = i;
				break;
			}
		}
		System.out.println(temp);
	}

}
