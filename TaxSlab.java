import java.util.Scanner;

public class TaxSlab {
public static void main(String[] args) {
	Scanner dd=new Scanner(System.in);
	System.out.println("Please Enter your income in lakh: ");
	float j=dd.nextFloat();
	if(j<250000.0f)
	{
		System.out.println("you are exampt from tax slab");
	}else if(j>=250000.0f && j<500000.0f)
	{
		float p=j*5/100;
		System.out.println(p);
	}else if(j>=500000.0f&&j<1000000.0f)
	{
		float u=j*20/100;
		System.out.println(u);
	}else
	{
		float k=j*30/100;
		System.out.println(k);
	}
}
}
