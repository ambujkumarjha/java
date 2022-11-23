
public class Shadow {
	static int x=99;
	public static void main(String[] args) {
		System.out.println(x);// it will print 99
		int x=2002;
		System.out.println(x);
		fun();
		
	}
	
	static void fun()
	{
		System.out.println(x);
	}

}
