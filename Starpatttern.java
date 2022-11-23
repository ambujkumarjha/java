import java.util.Scanner;

public class Starpatttern {
	public static void main(String[] args) {
		Scanner ssc=new Scanner(System.in);
		int s=ssc.nextInt();
		for(int i=s;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

} 
