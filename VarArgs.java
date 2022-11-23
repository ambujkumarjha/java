import java.util.Arrays;

public class VarArgs {
public static void main(String[] args) {
	fun(2,3,321,1,323,12,3,3,1,23,321,32,3223,231,12312,32,3312,3312,231,45,312,3,32,131,123,32123123,1233,312,89);
	var(45,56,"kundan","shaquib","mohenjodaro");
	
	
}
static void fun(int...ambuj)
{
	System.out.println(Arrays.toString(ambuj));
	
}
static void var(int a ,int b,String...str)
{
	System.out.println(str);
}
}
