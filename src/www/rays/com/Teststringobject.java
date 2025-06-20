package www.rays.com;

public class Teststringobject {
	public static void main(String [] args) {
		String s1 = "SUNRAYS";
		String s2 = new String ("SUNRAYS");
		System.out.println(s1 == s2);
		System.out.println(s1.contentEquals(s2));
	}

}
