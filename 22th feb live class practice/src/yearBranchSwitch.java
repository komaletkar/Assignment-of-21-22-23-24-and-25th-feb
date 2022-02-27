import java.util.Scanner;

public class yearBranchSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		System.out.println("enter branch");
		String branch = sc.nextLine();
		
		switch (year) {
        case 1:
             System.out.println("All subjects are common");
             break;
        case 2:
        case 3:
        case 4:
              switch (branch) {
                case "IT":
                case "CSE":
                    System.out.println("You have opted for computer branch");
                    break;
                case "EE":
                case "ECE":
                    System.out.println("You have opted for electrical branch");
                    break;
                case "Mechanical":
                    System.out.println("You have opted for Mechanical branch");
                    break;
                default:
                    System.out.println("Invalid branch Input");
                    break;
                }
            break;
        default:
            System.out.println("Invalid  year Input");
            break;
    }

	}
	}

