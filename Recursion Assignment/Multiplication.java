// Multiplication (Recursive)
// Send Feedback
// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
// Input format :
// Line 1 : Integer M
// Line 2 : Integer N
// Output format :
// M x N
// Constraints :
// 0 <= M <= 1000
// 0 <= N <= 1000
// Sample Input 1 :
// 3 
// 5
// Sample Output 1 :
// 15
// Sample Input 2 :
// 4 
// 0
// Sample Output 2 :
// 0

//CODE:

public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if (m < n) 
            return multiplyTwoIntegers(n, m); 
      
        // iteratively calculate  
        // y times sum of x 
        else if (n != 0) 
            return (m + multiplyTwoIntegers(m, n - 1)); 
      
        // if any of the two numbers is  
        // zero return zero 
        else
            return 0; 
	}
}
