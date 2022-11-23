import java.util.Scanner;
public class BreakAndContinue {
	public static void main(String[] args) {
		Scanner gf=new Scanner(System.in);
		System.out.println("enter the number  : ");
		int num=gf.nextInt();
		System.out.println("enter the number from where you want break it : ");
		int cut=gf.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
			
			if(i>=cut)
			{
				System.out.println("I told you it will break");
				break;
			}
		}
		System.out.println("enter the number  : ");
		int ank=gf.nextInt();
		System.out.println("enter the number from where you want continue(skip) it : ");
		int chhor=gf.nextInt();
		
		for(int i=0;i<=ank;i++)
		{
			System.out.println(i);
			
			if(i>=chhor)
			{
				System.out.println("I told you it will continue");
				continue;
				
			}
			System.out.println("ok continued");
		}
		
		
	}

}
