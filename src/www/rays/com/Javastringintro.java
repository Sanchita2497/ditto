package www.rays.com;

public class Javastringintro {
	public static void main(String[] args) {
		String name = "Sanchita chikhliya";
		System.out.println("String Length- " + name.length());
		System.out.println("6th character is- " + name.charAt(5));
		System.out.println("index of a:" + name.indexOf('a'));
		System.out.println("last index of a: " + name.lastIndexOf('a'));
		System.out.println("replace a with z: " + name.replace('a', 'z'));
		System.out.println("chota sanchita: " + name.toLowerCase());
		System.out.println("bada sanchita: " + name.toUpperCase());
		System.out.println("name start with sanchita:" + name.startsWith("Sanchita"));
		System.out.println("name ends with sanchita:" + name.endsWith("iya :"));
		System.out.println("sub string of 6: " + name.substring(6));
	}
}