import java.util.Scanner;
public class QuadraticEquationTest{
	public static void main(String[] args){
		QuadraticEquation question = new QuadraticEquation();

		System.out.println("Enter the value for coefficient of x squared:");
		Scanner input = new Scanner(System.in);
		int xSquaredCoefficient = input.nextInt();
		question.setCoefficientOfXSquared(xSquaredCoefficient); 

		System.out.println("Enter the value for coefficient of x:");
		int xCoefficient = input.nextInt();
		question.setCoefficientOfX(xCoefficient); 

		System.out.println("Enter the value for coefficient of the constant:");
		int constant = input.nextInt();
		question.setConstant(constant); 
		
		question.calculateX1();
		question.calculateX2();
		System.out.printf("%s%.2f%n", "x1 = ", question.getX1());
		System.out.printf("%s%.2f%n", "x2 = ", question.getX2());

	}


}