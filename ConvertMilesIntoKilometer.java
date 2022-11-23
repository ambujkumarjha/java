import java.util.Scanner;
public class ConvertMilesIntoKilometer {

	public static void main(String[] args) {
		System.out.println("Enter the km: ");
		Scanner df=new Scanner(System.in);
	  float km=df.nextFloat();
	  float miles=km*0.62137119f ;
	  System.out.println(miles);

	}

}
