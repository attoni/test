package test;

public class Test {
	
	
public static void main(String[] args) {
	

	ClassicSingleton a=ClassicSingleton.getInstance();
	ClassicSingleton b= ClassicSingleton.getInstance();
a.seta("ilki");
b.seta("ikinci");
a.geta();
b.geta();

Integer s =Integer.valueOf("24",8);
	System.out.println("\b"+s+"\b"+s);
}
}
