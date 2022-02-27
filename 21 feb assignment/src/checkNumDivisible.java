import java.util.Scanner;

public class checkNumDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number");
		int n = sc.nextInt();
		
	if(n%2==0 && n%8==0 || n%12!=0)
	{
		
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	

	}

}
