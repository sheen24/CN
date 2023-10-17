// Check Palindrome (recursive)
// Send Feedback
// Check whether a given String 'S' is a palindrome using recursion.


// Return true or false.


// Note:
// You don’t need to print anything. Just implement the given function.
// Example:
// Input: s = "racecar"
// Output: true
// Explanation: "racecar" is a palindrome.
// Input Format:
// The first and only line of the input contains string S.
// Output format:
// Return a boolean value True or False.
// Sample Input 1:
// abbba
// Sample Output 1:
// true
// Explanation Of Sample Input 1 :
// “abbba” is a palindrome
// Sample Input 2:
// abcd
// Sample Output 2:
// false
// Explanation Of Sample Input 2 :
// “abcd” is not a palindrome.
// Constraints:
// 0 <= |S| <= 10^6
// where |S| represents the length of string S.

CODE
  public class Solution {


    static boolean isPalRec(String str, 
                            int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;
 
        // If first and last 
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
 
        // If there are more than 
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return true;
    }
 
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n = str.length();
 
    // An empty string is 
    // considered as palindrome
        if (n == 0)
            return true;
 
        return isPalRec(str, 0, n - 1);
    
    }
}

