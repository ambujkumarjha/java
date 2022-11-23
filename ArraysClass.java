import java .util.Scanner;
public class ArraysClass {
public static void main(String[] args) {
	int arrr[]= {1,2,3,4,5};
	for(int i=0;i<arrr.length-2;++i) {
		System.out.println(arrr[i]+" ");
	}
	System.out.println("**************************reverse order*******************************");
	int Arr[]= {1,43,54,65,32,90,89};
	for(int i=Arr.length-1;i>=0;i--) {
		System.out.println(Arr[i]);
	}
	System.out.println(Arr.length);
	System.out.println("***********************************for each loop******************");
	float kl[]= {233.4f,4.5f,3.7f,90.1f};
	for(float element:kl)
	{
		System.out.println(element);
	}
}

}
