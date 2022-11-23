import java.util.Scanner;
public class SumNNaturalNo {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int j=Sc.nextInt();
	int sum =0;
	for(int i=1;i<=j;i++)
	{
		sum=sum+2*i;
	}
	System.out.println(sum);
	System.out.println("enter the number");
	int g=Sc.nextInt();
	int i=1;
	int mum=0;
	while(i<=g)
	{
		mum=mum+2*i;
		i++;
	}
	System.out.println(mum);
}
}
