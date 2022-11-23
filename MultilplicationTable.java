import java.util.Scanner;
public class MultilplicationTable {

	public static void main(String[] args) {
		Scanner ty=new Scanner(System.in);
		System.out.println("Enter the no.");
		int num=ty.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"X"+i+"="+i*num);
		}
		System.out.println("*************---------************");
		for(int i=10;i>=1;i--)
		{
			System.out.println(num+"X"+i+"="+i*num);
		}

	}

}
