import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		Scanner lk=new Scanner(System.in);
		System.out.println("enter the year");
		int y=lk.nextInt();
		if(y%4==0 && y%400==0)
		{
			System.out.println("yah! its a leap year");
		}
		else
		{
			System.out.println("ohh not its not a leap year");
		}
	}

}
