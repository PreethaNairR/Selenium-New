package firstPgm;

public class Calculation {

	public static int n1 = 100;
	public static int n2 = 200;
	public static String message = "answer is";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = n1+n2;
		System.out.println("Answer =" +result);
		//System.out.println("New");
		newOperations();
		
		
	}
public static void newOperations() {
	System.out.println(message);
}
}

