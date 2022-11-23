
import java.util.Arrays;
import java.util.Scanner;
public class ArrayComplexItems {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			 arr[i]=in.nextInt();
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+ " ");
//		}
//		for(int elem:arr)
//		{
//			System.out.println(elem);
//		}
		//System.out.println(Arrays.toString(arr));
		String[] str=new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]=in.next();
		}
		System.out.println(Arrays.toString(str));
		str[2]="gyan";
		System.out.println(Arrays.toString(str));
		
		
		
		
	}

}
