import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First NO.:");
		double a = sc.nextDouble();
		System.out.println("Select Operator: (+,-,*,/):");
		char op = sc.next().charAt(0);
		System.out.println("Enter Seccond No. :");
		double b = sc.nextDouble();
		double addition = a+b;
		double subtraction = a-b;
		double multiplication = a*b;
		double division = a/b;
		switch (op) {
		case '+' :
			System.out.println("After Adding Result is : "+ addition);break;
		case '-' :
			System.out.println("After Subtraction The Value Is : "+subtraction);break;
		case '*' :
			System.out.println("After Multiplication Result is : "+multiplication);break;
		case '/' :
			System.out.println("After Division The Value IS : "+division);break;
			default:
				System.out.println("Please Enter A Valid Operator !!");
				sc.close();
		}
	
	}
	}


