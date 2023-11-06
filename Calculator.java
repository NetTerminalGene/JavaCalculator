import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyCalculator {
	public static void main(String[] args) { 
		Scanner scnr = new Scanner (System.in);
		calcStart(scnr); // Opens the calculator //
	}
	
public static String calcStart(Scanner scnr) { 
				
				System.out.println("Enter the calculator mode: Standard/Scientific?"); // Calculator asks for modes //
				String prompt = scnr.next();
				
				if (prompt.equalsIgnoreCase("Standard")) { // Opens standard mode //
					System.out.println("The calculator will operate in standard mode.");
					standardMode(scnr);
				}
				else if (prompt.equalsIgnoreCase("Scientific")) { // Opens scientific mode //
					System.out.println("The calculator will operate in scientific mode.");
					scientificMode(scnr);
				}
				else {
					System.out.println("Invalid"); // User doesn't input "standard" or "scientific" //
					calcStart(scnr); // Re-asks the question //
				}
			return prompt;
		}
	
/* ---------- STANDARD MODE ---------- */
public static double standardMode(Scanner scnr) {
		
	List<Double> numbers = new ArrayList<Double>(); // ArrayList of numbers //		
		
	System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
		
	String operation = scnr.next();
		
	switch (operation) {
		
	case "+": // User wants to add //
			
		System.out.println("How many numbers do you want to add?");
		int addAmount = scnr.nextInt();
		System.out.println("Enter " + addAmount + " numbers");
			
		double addNum = scnr.nextDouble(); // Numbers user wants to add //
			
		for(int i = 1; i < addAmount; i++) {
			addNum += scnr.nextDouble();
			numbers.add(addNum);
		}
			
		System.out.println("Result: " + addNum);
		break;
			
	case "-": // User wants to subtract //
			
		System.out.println("How many numbers do you want to subtract?");
		int subAmount = scnr.nextInt();
		System.out.println("Enter " + subAmount + " numbers");
			
		double subNum =  scnr.nextDouble(); // Numbers user wants to subtract //
			
		for (int i = 1; i < subAmount; i++) {
			subNum -= scnr.nextDouble();
			numbers.add(subNum);
		}
				
		System.out.println("Result: " + subNum);
		break;
			
	case "*": // User wants to multiply //
			
		System.out.println("How many numbers do you want to multiply?");
		int mulAmount = scnr.nextInt();
		System.out.println("Enter " + mulAmount + " numbers");
			
		double mulNum = scnr.nextDouble(); // Numbers user wants to multiply //
				
		for(int i = 1; i < mulAmount; i++) {
			mulNum *= scnr.nextDouble();
			numbers.add(mulNum);
		}
		
		System.out.println("Result: " + mulNum);
		break;
			
	case "/": // User wants to divide //
			
		System.out.println("How many numbers do you want to divide?");
		int divAmount = scnr.nextInt();
		System.out.println("Enter " + divAmount + " numbers");
			
		double divNum = scnr.nextDouble(); // Numbers user wants to divide //
				
		for(int i = 1; i < divAmount; i++) {
			divNum /= scnr.nextDouble();
			numbers.add(divNum);
		}
			
		System.out.println("Result: " + divNum);
		break;
			
	default:
		System.out.println("Invalid operator " + operation); // User doesn't input '+', '-', '*', '/' //
		standardMode(scnr);
	} 
		
	String question = "Do you want to start over? (Y/N)";
	System.out.println(question);
	String answer = scnr.next();
	
	if (answer.equalsIgnoreCase("Y")) {
		calcStart(scnr); // Takes user back to calculator after saying "yes" //
	}
		
	else if (answer.equalsIgnoreCase("N")) {
		System.out.println("Goodbye");
		System.exit(0); // Ends after saying "no" //
	}
		
	scnr.close();
		
	double nonNum = 0; // standardMode() returns this //
	return nonNum;
}



/* ---------- SCIENTIFIC MODE ---------- */
public static double scientificMode(Scanner scnr) {
	
	List<Double> numbers = new ArrayList<Double>(); // ArrayList of numbers //		
	
	System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
	
	String operation = scnr.next();
	
	switch (operation) {
	
	case "+": // User wants to add //
		
		System.out.println("How many numbers do you want to add?");
		int addAmount = scnr.nextInt();
		System.out.println("Enter " + addAmount + " numbers");
		
		double addNum = scnr.nextDouble(); // Numbers user wants to add //
		
		for(int i = 1; i < addAmount; i++) {
			addNum += scnr.nextDouble();
			numbers.add(addNum);
		}
		
		System.out.println("Result: " + addNum);
		break;
		
	case "-": // User wants to subtract //
		
		System.out.println("How many numbers do you want to subtract?");
		int subAmount = scnr.nextInt();
		System.out.println("Enter " + subAmount + " numbers");
		
		double subNum =  scnr.nextDouble(); // Numbers user wants to subtract //
		
		for (int i = 1; i < subAmount; i++) {
			subNum -= scnr.nextDouble();
			numbers.add(subNum);
		}
			
		System.out.println("Result: " + subNum);
		break;
		
	case "*": // User wants to multiply //
		
		System.out.println("How many numbers do you want to multiply?");
		int mulAmount = scnr.nextInt();
		System.out.println("Enter " + mulAmount + " numbers");
		
		double mulNum = scnr.nextDouble(); // Numbers user wants to multiply //

			
		for(int i = 1; i < mulAmount; i++) {
			mulNum *= scnr.nextDouble();
			numbers.add(mulNum);
		}
		
		System.out.println("Result: " + mulNum);
		break;
		
	case "/": // User wants to divide //
		
		System.out.println("How many numbers do you want to divide?");
		int divAmount = scnr.nextInt();
		System.out.println("Enter " + divAmount + " numbers");
		
		double divNum = scnr.nextDouble(); // Numbers user wants to divide //
			
		for(int i = 1; i < divAmount; i++) {
			divNum /= scnr.nextDouble();
			numbers.add(divNum);
		}
		
		System.out.println("Result: " + divNum);
		break;
		
	case "sin": // User wants to find the sine //
		
		System.out.println("Enter a number in radians to find the sine");
		double radians = scnr.nextDouble();
		double sine = Math.sin(radians);
		
		System.out.println("Result: " + sine);
		break;
		
	case "cos": // User wants to find the cosine //
		
		System.out.println("Enter a number in radians to find the cosine");
		double radians2 = scnr.nextDouble();
		double cosine = Math.cos(radians2);
		
		System.out.println("Result: " + cosine);
		break;
		
	case "tan": // User wants to find the cosine //
		
		System.out.println("Enter a number in radians to find the tangent");
		double radians3 = scnr.nextDouble();
		double tangent = Math.tan(radians3);
		
		System.out.println("Result: " + tangent);
		break;
		
	default:
		System.out.println("Invalid operator " + operation); // User doesn't input '+', '-', '*', '/' //
		scientificMode(scnr);
	} 
	
	String question = "Do you want to start over? (Y/N)";
	System.out.println(question);
	String answer = scnr.next();
	
	if (answer.equalsIgnoreCase("Y")) {
		calcStart(scnr); // Takes user back to calculator after saying "yes" //
	}
	
	else if (answer.equalsIgnoreCase("N")) {
		System.out.println("Goodbye");
		System.exit(0); // Ends after saying "no" //
	}
	
	scnr.close();
	
	double nonNum = 0; // scientificMode() returns this //
	return nonNum;
	
}


}
