import java.util.Scanner;

public class NumberUsingDoWhileLoop {
public static void main(String[] args) {
	Scanner ty=new Scanner(System.in);
	int num=ty.nextInt();
	System.out.println("Enter the  number: ");
	int i=100;
	do {
		System.out.println(i);
		i++;
		
	}while(i<=num);
	
}
}
