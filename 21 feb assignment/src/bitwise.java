import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int resofAnd=(a&b);
		int resofOr=(a|b);
		int resofWedge=(a^b);
		
		System.out.println(resofAnd);
		System.out.println(resofOr);
		System.out.println(resofWedge);

	}

}
