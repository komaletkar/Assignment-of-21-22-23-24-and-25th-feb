import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int count=0;
		int sum=0;
		int res=(4*3+9);
		for(int i=1;i<=n;i++)
		{
			if(res%3==0)
			{

				sum=sum+res;
				count++;
			}
			System.out.println(sum);
		}
		


	}

}
