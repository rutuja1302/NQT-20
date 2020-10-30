/*WAP to find the number of characters and words in a given sentence
 * Input
 * First-line contains input string, less than or equal to buffer size N=100
 * Output
 * Output contains two integer numbers separated by a new line. The first number contains the total number of characters
 * and second number represents the total number of words in the given string.
 * Constraints
 * N = 100
 * 
 * Example 1:
 * Input
 * Hello World
 * Output
 * 11
 * 2
 * Explanation
 * String "Hello World" contains a total of 11 characters which includes 1 white space. It is also a combination of 2 words.
 * 
 * Example 2:
 * Input
 * Start to Think
 * Output
 * 14
 * 3
 * Explanation
 * String "Start to Think" contains a total of 14 characters which includes 2 white spaces. It is also a combination of 3 words
 * 
 * Example 3:
 * Input
 * Think and implement
 * Output
 * 19
 * 3
 * Explanation
 * String "Think and implement" contains 19 characters and 3 words.*/
 
import java.util.*;
public class NumberOfChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] str_array = str.split(" ");
		int words = str_array.length;  //Second line of output - Number of words
		int white_spaces = str_array.length - 1;
		//counting the number of characters in the given input string
		int chars = 0;
		for(int i=0; i<str_array.length;i++) {
			chars += str_array[i].length();
		}
		//adding the whitespaces to the total number of characters
		chars += white_spaces;
		//Printing the final output
		System.out.println(chars);
		System.out.println(words);
	}
}
