//Evan White
import java.util.Scanner;

public class IfLab4EW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Problem 1
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your Grade (9-12): ");
		int grade = input.nextInt();
		
		if(grade == 9)
	        System.out.println("You are a Freshman\n");
		
		if(grade == 10)
			System.out.println("You are a Sophomore\n");
		
	    if(grade == 11)
			System.out.println("You are a Junior\n");
		
		if(grade == 12)
			System.out.println("Your are a Senior\n" );
		
//Problem 2		
		
		System.out.println("Enter Your Number Grade: ");
		double score = input.nextDouble();
		
		if(score >= 90)
			System.out.println("You have an excellent grade!\n");
		
		if(score >= 80 && score <= 90)
			System.out.println("You have an above average grade!\n");
	
		if(score >= 70 && score <= 80)
			System.out.println("You have an average grade!\n");
		
		if(score >= 0 && score <= 70)
			System.out.println("You have a below average grade!\n");
		
//Problem 3
		
        System.out.println("Print a length: ");
		int length = input.nextInt();
		
		System.out.println("Print a width: ");
		int width = input.nextInt();
		
		if(length == width)
		     System.out.println("You have a Square\n");
		
		else
			System.out.println("You have a quadrilateral\n");
		
		System.out.println("The perimeter is " + (2 * width + 2 * length));
		System.out.println("\nThe area is " + (width * length));
	}

}
/*
	Input your Grade (9-12): 
	9
	You are a Freshman

	Enter Your Number Grade: 
	99
	You have an excellent grade!

	Print a length: 
	20
	Print a width: 
	12
	You have a quadrilateral

	The perimeter is 64

	The area is 240
*/