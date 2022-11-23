
public class FunctionOverloading {
// function overloading is nothing but only in it the function have the same name same return type but varies in
	//type of argument and no of argument
	public static void main(String[] args) {
		fun(2);
		fun(2,3);
		fun("ambuj kumar jha ");
		
	}
	static void fun(int a)
	{
		System.out.println(a);
		
	}
	static void fun(String c)
	{
		System.out.println(c);
		
	}
	static void fun(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
}
