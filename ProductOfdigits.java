package NumberTasks;
import java.util.Scanner;
public class ProductOfdigits {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the no of elements");
				int n = scan.nextInt();
				int mul = 1;
				for(int i=0;i<n;i++) {
					System.out.println("Enter the number:"+i);
					int num =scan.nextInt();
					mul *= num;
					
	    }
				System.out.println( "The Product Of Numbers is"+mul);

	}

}
