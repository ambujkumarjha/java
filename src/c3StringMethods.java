import java.util.Scanner;
public class c3StringMethods {
	public static void main(String[] args) {
		
		Scanner hj=new Scanner(System.in);
		String name="Ambuj";
		int value=name.length();
		String lstring=name.toLowerCase();
		String Ustring=name.toUpperCase();
	  String nontrimed="  Ambuj  ";
	  String SuString=name.substring(3);
		String trimed=nontrimed.trim();
		String nam="kalyaninini";
		
//		System.out.println(SuString);
//		System.out.println(name.substring(0));
//		System.out.println(name.substring(1,4));
//		System.out.println(name.replace('A', 'H'));
//		System.out.println(name.replace("Amb", "tarb"));
//		System.out.println(name.startsWith("Am"));
//		System.out.println(name.endsWith("uj"));
//		System.out.println(name.charAt(3));
//		System.out.println(name.indexOf("Ambuj"));
//		System.out.println(nam.indexOf("in",8));
//		System.out.println(nam.lastIndexOf("i"));
		System.out.println(nam.lastIndexOf("kl",2));
		System.out.println(name.equals("Ambuj"));
		System.out.println(name.equalsIgnoreCase("AmBuj"));
		System.out.println("THE newline \n the tab: \t the single quote \' the backslash \\");
		
//	    System.out.println(trimed);
//		System.out.println(Ustring);
//		System.out.println(lstring);
//		System.out.println(value);
//				
		}

}
   