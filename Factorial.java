import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner jk=new Scanner(System.in);
		int j=jk.nextInt();
		int fact=1;
		for(int i=j;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
		int k=jk.nextInt();
		int ko=1;
		while(k>=1)
		{
			ko*=k;
			k--;
		}
		System.out.println(ko);
	}

}
