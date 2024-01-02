// Problem statement
// Given a string, compute recursively a new string where all 'x' chars have been removed.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// String S
// Output format :
// Modified String
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string S. 
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
// Sample Input 3 :
// xx
// Sample Output 3:

// public class solution {

// 	// Return the changed string
// 	//public static String removeX(String input){
// 		// Write your code here
// 		public static String removeX(String s) {
//     if (s.length() == 0) {
//         return "";
//     }

public class solution {

	// Return the changed string
	//public static String removeX(String input){
		// Write your code here
		public static String removeX(String s) {
    if (s.length() == 0) {
        return "";
    }
    
    char firstChar = s.charAt(0);
    String remainingString = s.substring(1);
    
    if (firstChar == 'x') {
        return removeX(remainingString);
    } else {
        return firstChar + removeX(remainingString);
    }
}

	
}

