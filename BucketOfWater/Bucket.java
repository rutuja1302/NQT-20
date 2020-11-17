/*There is a Bucket of water capacity of x litres, which is supposed to fill with a mug of y millilitres water capacity.
 * Say for example x=100 and y=10, then bucket will get full of minimum of 8 mugs(>80% and less than 100%).
 * Bucket filling is to be stopped once more than 80% of the bucket capacity is filled.
 * The amount of water taken at a time in mug is not fixed as it can be any value less than or equal to y.
 * Notify to stop once bucket is full that is more than 80% of capacity of bucket and count number of mugs poured into bucket.
 * Note that bucket capacity will always be greater that Mug's Capacity
 * 
 * Example 1:
 * INPUT VALUES
 * 100  //Enter Bucket capacity in litres as this
 * 20  //Enter Mug capacity in litres as this
 * 
 * //Enter Amount of water in MUG one after other as below
 * 20
 * 20
 * 20
 * 20
 * 
 * OUTPUT VALUES
 * BUCKET FULL!
 * NUMBER OF MUGS: 4
 * 
 * Note: Order of inputs should be same as shown in above example*/

import java.util.Scanner;
public class Bucket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bucket_cap = scan.nextInt();  //Bucket Capacity
		int mug_cap = scan.nextInt();  //Mug Capacity
		int nearlyFull = (80*bucket_cap)/100;  //80% of bucket capacity
		int mugs = nearlyFull/mug_cap;  //Number of mugs
		
		System.out.println("BUCKET FULL!");
		System.out.println("NUMBER OF MUGS: "+mugs);
	}
}
