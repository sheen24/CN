// Sum of digits (recursive)
// Send Feedback
// Write a recursive function that returns the sum of the digits of a given integer.
// Input format :
// Integer N
// Output format :
// Sum of digits of N
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 12345
// Sample Output 1 :
// 15
// Sample Input 2 :
// 9
// Sample Output 2 :
// 9

Code
  
public class solution {

	public static int sumOfDigits(int n){
		// Write your code here
		if (n==0){
			return 0;
		}
		int r=n%10;
		return r + sumOfDigits(n/10);
	}
}

