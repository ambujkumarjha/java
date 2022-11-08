import java.util.Scanner;
public class Newcgpa {

	public static void main(String[] args) {
		System.out.println("Enter the marks of the student: ");
		Scanner pc=new Scanner(System.in);
		System.out.println("Enter the marks of first subject");
		float s1=pc.nextFloat();
		System.out.println("Enter the marks of 2nd subject");
		float s2=pc.nextFloat();
		System.out.println("Enter the marks of 3rd subject");
		float s3=pc.nextFloat();
	    float result=(s1+s2+s3)/30;
	    System.out.println(result);

	}

}
