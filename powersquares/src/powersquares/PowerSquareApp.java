package powersquares;
import java.util.*;
public class PowerSquareApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		System.out.println(Powersq.squareNumber(num));

	}

}
