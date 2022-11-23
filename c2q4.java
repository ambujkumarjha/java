import java.util.Scanner;
public class c2q4 {
	public static void main(String[] args) {
		int v,u,s,a;
		Scanner jn=new Scanner(System.in);
		int v=jn.nextInt();
		int u=jn.nextInt();
		int s=jn.nextInt();
		int a=jn.nextInt();
		int eq=(v*v-u*u)/2*a*s;
		System.out.println(eq);
		
	}

}
