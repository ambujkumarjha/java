import java.util.Scanner;
public class C4Q2 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		float m1=Sc.nextFloat();
		float m2=Sc.nextFloat();
		float m3=Sc.nextFloat();
//		float m4=Sc.nextFloat();
//		float m5=Sc.nextFloat();
		if(m1>33&&m2>33&&m3>33)
		{
			if((m1+m2+m3)*(1/100)>=40)
			{
				System.out.println("PASS");
				
			}
			else
			{
				System.out.println("FAIL");
			}
		}
		else
		{
			System.out.println("FAil");
		}
		

	}

}
