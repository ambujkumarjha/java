import java.util.Scanner;
public class weekDay {
	public static void main(String[] args) {
		Scanner jj =new Scanner(System.in);
		System.out.println("Enter the no.");
		int j=jj.nextInt();
		switch(j) {
		case 1:
			System.out.println(" Sunday");
		
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			
		default:
			System.out.println("ohh please enter the correct number");
			
		}
		
	}

}
