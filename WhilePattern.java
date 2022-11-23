import java.util.Scanner;
public class WhilePattern {
public static void main(String[] args) {
	Scanner vb=new Scanner(System.in);
	int h=vb.nextInt();
    int j=1;
	while(h>=1)
	{	
		
		while(j<=h)
		{
			System.out.print("*");
			j++;
		}
		System.out.println("\n");
		h--;
	}
	
}
}
