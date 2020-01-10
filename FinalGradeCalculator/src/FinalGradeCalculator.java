import java.util.*;


public class FinalGradeCalculator {

	private static Scanner semGrade;
	private static Scanner finGrade;
	private static float x;
	private static float y;
	private static double z;

	public static void main(String[] args) {
	
		int i = 0;
		boolean input;
		input = false;
		
			
			while (i==0) {
				System.out.println("Enter your current grade: ");	
				try {	
					semGrade = new Scanner(System.in);
					x = semGrade.nextFloat();
					input = false;
				}	catch (Exception e) {
					System.out.println("Please enter grade as a nuumber!");
					input = true;
				}
				
				if (!input) {
					try {
						System.out.println("Enter your desired final grade: ");
						finGrade = new Scanner(System.in);
						y = finGrade.nextFloat();
						i = 1;
					} catch (Exception e) {
						System.out.println("Please enter grade as a number!");
					}
				}
			}

			z = (y - (0.8 * x)) / 0.2;		
		
		System.out.println("To achieve this final grade you must score: " + z + "%");
	}

}