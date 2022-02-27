import java.util.Scanner;

public class firstSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int count=0;
		int sum=0;
		int res=(7*6*7);
		for(int i=1;i<=n;i++)
		{
			if(res%6==0)
			{

				sum=sum+res;
				count++;
			}
			System.out.println(sum);
		}

	}

}
