import java.util.*;

class Calculator
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Sum of a and b is "+ (a+b));
	}
}
		