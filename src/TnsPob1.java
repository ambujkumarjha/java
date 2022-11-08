import java .util.Scanner;
public class TnsPob1 {
	public static void main(String[] args) {
		System.out.println("Enter the marks of the student:");
		System.out.println("Hindi");
		Scanner sc=new Scanner(System.in);
		float hin=sc.nextFloat();
		System.out.println("English");
		float eng=sc.nextFloat();
		System.out.println("mathematics");
		float math=sc.nextFloat();
		System.out.println("science");
		float sci=sc.nextFloat();
		System.out.println("social science");
		float ssc=sc.nextFloat();
		float sum=hin+eng+math+sci+ssc;
		float pst=sum/1600*100;
		System.out.println(pst);
	}

}
