package www.rays.com;

public class reversdigit {
	public static void main(String [] args) {
		int no = 123;
		int revers = 0;
		int temp = no;
		int r = 0;
		while (temp > 0){
			r = temp % 10;
			revers = (revers * 10) + r;
			temp = temp / 10;
			
			}
		System.out.println("revers no:" + revers);
		}

}
