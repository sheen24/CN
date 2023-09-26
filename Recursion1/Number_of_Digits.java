// Number of Digits
// Send Feedback
// You are given a number 'n'.
// Return number of digits in ‘n’.
// Example:
// Input: 'n' = 123
// Output: 3
// Explanation:
// The 3 digits in ‘123’ are 1, 2 and 3. 
// Input format:
// The first line of input contains an integer ‘n’.
// Output Format:
// Return an integer as described in the problem statement. 
// Note
// You don’t need to print anything, it has already been taken care of, just complete the given function.
// Sample Input 1:
// 121
// Sample Output 1:
// 3
// Explanation of sample output 1:
// There are 3 digits in 121 are 1,2 and 1.
// Sample Input 2:
// 38
// Expected time complexity :
// The expected time complexity is O(log n).
// Constraints:
// 1 <= ‘n’ <= 10^9

code:
public class Solution {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
