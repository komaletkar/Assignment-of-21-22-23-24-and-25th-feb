import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number");
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int ans=1;
		while(exponent>0) {
		ans = ans*base;
		--exponent;
		}
		
		System.out.println(ans);
	}

}

