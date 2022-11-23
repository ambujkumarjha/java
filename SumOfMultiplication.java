import java.util.Scanner;
public class SumOfMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mn=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int k=i*mn;
			System.out.println(k);
			sum=sum +k;
			
		}
		System.out.println(sum);
		  
	}

}
