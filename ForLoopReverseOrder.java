import java.util.Scanner;
public class ForLoopReverseOrder {
public static void main(String[] args) {
	
	Scanner jha= new Scanner(System.in);
	System.out.println("enter the number");
	int num=jha.nextInt();
	
	for(int i=num;i>=1;i--)
	{
		System.out.println(i);
	}
	System.out.println("*********************************");
	
	for(int i=1;i<=num;i++)
	{
		System.out.println(2*i+1);
		
	}
}
}
