import java.util.Scanner;
public class TwoDAndMultidimentionalArray {
public static void main(String[] args) {
	int  [][]arr= new int[2][2];
	arr[0][0]=100;
	arr[0][1]=101;
	arr[1][0]=123;
	arr[1][1]=324;
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
