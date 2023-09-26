// Check if array is sorted
// Send Feedback
// You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.


// Example:
// Input:
// A = [1, 3, 6, 10]
// Output:
// True
// Explanation: Since array ‘A’ is sorted, therefore output is ‘True’.
// Input Format:
// The first line of the input contains an integer ‘N’.
// The next line will contain ‘N’ space-separated integers.
// Output Format:-
// The output contains a string 'True' or 'False'.
// Note:-
// You don’t need to print anything. Just implement the given function.
// Sample Input 1:
// 5
// 10 20 30 20 40
// Sample Output 1:
// False
// Explanation Of Sample Input 1:
// A = [10, 20, 30, 20, 40]
// Since array ‘A’ is not sorted, therefore output is ‘False’.
// Sample Input 2:
// 1



// 1100
// Sample Output 2:
// True
// Constraints:
// 1 <= N  <= 10^5
// 1 <= A[i] <= 10^9




code:
public class Solution {
    public static boolean arraySortedOrNot(int []arr, int N) {
        // Write your code here.
           for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
