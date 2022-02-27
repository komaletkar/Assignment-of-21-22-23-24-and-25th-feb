import java.util.Scanner;

public class switchDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inputs");
		int n=sc.nextInt();
		String dayString;
		switch(n)
		{
		case 1:
			dayString = "weekday";
			break;
		case 2:
			dayString ="weekday";
			break;
		case 3:
			dayString = "weekday";
			break;
		case 4:
			dayString = "weekday";
			break;
		case 5:
			dayString = "weekday";
			break;
		case 6:
			dayString = "weekend";
			break;
		case 7:
			dayString = "weekend";
			break;
			default:
				dayString = "Invalid Day";
			break;
			
		}
		System.out.println(dayString);

	}

}
