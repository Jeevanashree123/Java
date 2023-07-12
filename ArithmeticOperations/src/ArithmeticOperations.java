import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int result1=subtractNumber(20,5);
		System.out.println(result1);
		int result2=multiplyNumber(4,5);
		System.out.println(result2);
		double result3=divideNumber(20,4);
		System.out.printf("%.2f\n",result3);
		int result4=findRemainder(10,3);
		System.out.println(result4);

	}
	public static int subtractNumber(int num1, int num2)
	{
		return num1-num2;
	}
	public static int  multiplyNumber(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumber(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}




}
