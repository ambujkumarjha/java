import java.util.Scanner;
public class C4INCOME_TAX {

	public static void main(String[] args) {
		
		Scanner rh=new Scanner(System.in);
		System.out.println("HEllo,if your income comes in[2.5LTO3L] click 1\n if it comes in [5LTO10L] click 2\n if it comes in above 10 click 3");
		int chooes=rh.nextInt();
		System.out.println("enter income");
		int income=rh.nextInt();
		switch(chooes) {
		case 1:
			System.out.println("this ans 1st");
			break;
		case 2:
			System.out.println("this is 2nd ans");
			break;
		case 3:
			System.out.println("this is 3rd ans");
			break;
		}
		

	}

}
