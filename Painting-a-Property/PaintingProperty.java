/*We want to estimate the cost of painting a property
 * Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
 * Take input as
 * 1. Number of Interior walls
 * 2. Number of Exterior walls
 * 3. Surface Area of each Interior Wall in units of square feet
 * 4. Surface Area of each Exterior Wall in units of square feet
 * If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.
 * Calculate and display the total cost of painting the property
 * Example 1:
 * 6
 * 3
 * 12.3
 * 15.2
 * 12.3
 * 15.2
 * 12.3
 * 15.2
 * 10.10
 * 10.10
 * 10.00
 * Total estimated Cost : 1847.4 INR*/

import java.util.Scanner;

public class PaintingProperty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Read input: number of interior and exterior walls
		int interior_walls = scan.nextInt();
		int exterior_walls = scan.nextInt();
		//initializing costs and surface area
		double cost_i = 0.0;
		double cost_e = 0.0;
		double area;
		//calculating total surface area of interior walls
		for(int i=0; i<interior_walls; i++) {
			area = scan.nextDouble();
			cost_i += area;
		}
		//total cost of interior walls = total surface area of interior walls * 18
		cost_i *= 18;
		//calculating total surface area of exterior walls
		for(int i=0;i<exterior_walls;i++) {
			area = scan.nextDouble();
			cost_e += area;
		}
		//total cost of exterior walls = total surface area of exterior walls * 12
		cost_e *= 12;
		//tatal estimated cost = cost of paint req. for interior walls + cost of paint req. for exterior walls
		double estimated_cost = cost_i + cost_e;
		//print output
		System.out.println("Total estimated cost: "+estimated_cost+" INR");
	}
}
