import java.util.Arrays;
import java.util.Scanner;
public class FunctionOrMthods {
public static void main(String[] args) {
	
	
	int ipo=90;
	int bpo=89;
	{
		int po=9990909;
		ipo=95;
		//int ipo=69;///we can not initialize the it the block if it is already initialize in same method
	}
	//System.out.println(po);//can't use outside the block
	System.out.println(ipo);
	Scanner pc=new Scanner(System.in);
	
	int ans= sum();
	System.out.println(ans);
	int Ans=mul(2,3);
	System.out.println(Ans);
	String mor=greet("ambuj kumar");
	System.out.println(mor);
	int[] prr= {25,36,78,67,98, 78};
	change(prr);
	

	System.out.println(Arrays.toString(prr));
	
	
	}
//*****************call by value******************
static void change(int[] num)
{
	num[2]=999;
}
//********************String function****************
static String greet(String a)
{
	String f="HELLO MR."+a;
	return f;
}





static int sum()
{
	Scanner Sc=new Scanner(System.in);
	int a=Sc.nextInt();
	int b=Sc.nextInt();
	int c=a+b;
	return c;
}
static int mul (int a,int b)
{
	int h=a*b;
	return h;
}


}
