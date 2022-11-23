import java.util.Scanner;

public class TNS05TakingInput {
	public static void main(String[] args) {
		System.out.println("Taking input form the user");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int a2=sc.nextInt();
		int sum=a1+a2;
		System.out.println(sum);
		System.out.println("For checking the entered value is integer or not ");
		boolean b1 =sc.hasNextInt();
		
		System.out.println(b1);
	}

}
