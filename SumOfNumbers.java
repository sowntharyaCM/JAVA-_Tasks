package NumberTasks;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number:"+i);
			int num =scan.nextInt();
			sum += num;
			
		}
		System.out.println( "The sum of the given Numbers is:"+sum);
		
	}

}
