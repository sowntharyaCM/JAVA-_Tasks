package NumberTasks;

public class PalindromeChecker {

	public static void main(String[] args) {
		int p = 1221;
		int oldString = p;
		int sum = 0;
			while (p!=0) {
			sum = sum*10+(p%10);
			p = p/10;
     }
			if(sum == oldString) {
				System.out.println("The given number is a Palindrome");
				}else {
			    System.out.println("The given number is not a palindrom");
			}
}

}
