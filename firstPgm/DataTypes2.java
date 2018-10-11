package firstPgm;

public class DataTypes2 {

	public static String course, course2;
	public static int hours;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
course= "Java";
course2= "Selenium";
hours=45;
display();

	}

	
	public static void display()
	{
		System.out.println("I am learning"+course+"&"+course2+"training from Etech factory and the duration of the course is"+hours+".");
		System.out.println("Thank You for choosing");
			
	}
}
