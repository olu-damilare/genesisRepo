import java.util.Scanner;
public class Grade{

	public static void main(String[] args){

	System.out.println("Enter your score");
	Scanner input = new Scanner(System.in);
	double score = input.nextDouble();

	if(score < 40)
		System.out.println("Fail");
	if(score >= 40)
		System.out.println("Pass");

	}

}  