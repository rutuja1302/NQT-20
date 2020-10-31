/*There is a JAR full of candies for a sale at a mall counter. 
 * JAR has the capacity N, that is JAR can contain maximum N Candies when JAR is full.
 * At any point of time, JAR can have M number of Candies where M <= N. Candies are served to the customers. 
 * JAR is never remaining empty as when last k candies are left, JAR is refilled with new Candies in such a way that JAR gets full.
 * 
 * Write a code to implement above scenario. Display JAR at Counter with available number of candies. 
 * Input should be number of candies one customer orders at a point of time. Update the JAR after every purchase and display JAR at Counter. 
 * Output should give number of candies sold and updated number of Candies in JAR.
 * If input is more than number of Candies in JAR, return: “INVALID INPUT”
 * 
 * Given,
 * N=10, where N is NUMBER OF CANDIES AVAILABLE
 * K=<5, where k is the number of minimum Candies that must be inside JAR ever.
 *
 * Example 1: (N=10, k=<5)
 * Input Value
 * 3
 * Output Values
 * NUMBER OF CANDIES SOLD: 3
 * NUMBER OF CANDIES AVAILABLE: 7
 *
 * Example 2: (N=10, k=<5)
 * Input Value
 * 0
 * Output Value
 * INVALID OUTPUT
 * NUMBER OF CANDIES AVAILABLE: 10
*/

import java.util.Scanner;
public class Candies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 10; //max candies
		int k = 5; //min candies that must be inside the jar
		int candies = n; //candies left in the jar
		//reading the input value which should be greater than 0 and less or equal to k
		int m = scan.nextInt();
		//printing the output
		if(m<=k && m>0) {
			candies = n - m;
			System.out.println("NUMBER OF CANDIES SOLD: "+m);
			System.out.println("NUMBER OF CANDIES AVAILABLE: "+candies);
		}else {
			System.out.println("INVALID OUTPUT");
			System.out.println("NUMBER OF CANDIES AVAILABLE: "+candies);
		}
	}
}
