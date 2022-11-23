import java.util.Scanner;
public class FunctionQ1primeNO {
	public static void main(String[] args) {
	//	prime(3);
		armstrong(153);
		
		
	}
//	static void prime(int a)
//	{
//	 if(a<=1)
//	 {
//		 System.out.println("not prime");
//	 }
//	 else if(a!=2&&a%a==0&&a%1==0&&a%2!=0)
//	 {
//		 System.out.println("it is a prime ");
//	 }
//	 else if(a==2)
//	 {
//		 System.out.println("it is a prime no.");
//	 }
//	 else
//	 {
//		 System.out.println("not prime no.");
//	 }
//		
//	}
	static void armstrong(int b)
	{
		int g=b;
		int sum=0;
		while(b>0)
		{
			int rem=b%10;
			
			 sum=sum+rem*rem*rem; 
			 b=b/10;
			
		}
		if(sum==g)
		{
			System.out.println("it is aramstrong");
		}
	}

}
