import java.util.Scanner;
public class web {
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		String str=st.next();
		if(str.endsWith(".com"))
		{
			System.out.println("commercial website");
		}
		else if(str.endsWith(".in"))
		{
			System.out.println("Indian Website");
		}else if(str.endsWith(".org"))
		{
			System.out.println("orgnization website");
		}
	}

}
