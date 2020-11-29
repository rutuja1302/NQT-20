/* A food court facilitates their customers with a featured App where the customers can view the Menu Card and place their order. 
 * The order may be delivered on-premises as per policies. Write a code to take the order from the customers by pressing menu number, Quantity
 * After one customer completes the process of placing the order by pressing the Menu number and Quantity. Your code should accept y to continue taking order or n for stopping the process of order taking
 * Final output should be the calculated total amount.
 * Menu card is given as
 * Number Name                                Price
 * 1. Veg sandwich                            80.0
 * 2. Cheese sandwich                         130.0
 * 3. Veg Grilled sandwich                    100.0
 * 4. Sada Dosa                               80.0
 * 5. Masala Dosa                             90.0
 * 6. Onion Rava Sada Dosa                    110.0
 * 7. Onion Rava Masala Dosa                  120.0
 * 8. Spring Dosa                             140.0
 * 9. Plain Uttapam                           70.0
 * 10. Onion Uttapam                          80.0
 * You can use any suitable data structure to hold the menu card items with price.
 * Inputs for Menu Number and Quantity should be integers greater than 0 and less than 21. For any other input, return as output: INVALID INPUT
 * 
 * Example 1
 * INPUT VALUES
 * 1                        //for enter menu number
 * 2                        //for enter quantity
 * Y                        //Do you want to order
 * More Items? (y/n)
 * 2                        //for enter menu number
 * 3                        //for enter quantity
 * N                        //Do you want to order
 * More items? (y/n)
 * Output values
 * Total Amount : 550.0 INR
 * Note: Input prompt should not be the part of code
 * (Only accept values as input in order as given above)
 * Output should be in the format given above.*/

import java.util.Scanner;
public class FoodCourt {
	public static double bill(double[]price, int menu_num, int quant) {
		double total=0;
		total += price[menu_num-1]*quant;
		return total;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] price = {80.0,130.0,100.0,80.0,90.0,110.0,120.0,140.0,70.0,80.0};
		int menu_num;
		int quant;
		
		menu_num = scan.nextInt();
		quant = scan.nextInt();
		if(menu_num<0 || menu_num>20 || quant<0 || quant>20) {
			System.out.println("INVALID INPUT");
			System.exit(0);
		}else {
			double result = bill(price,menu_num,quant);
			String choice = scan.next().toLowerCase();
			while(choice.equals("y")) {
				menu_num = scan.nextInt();
				quant = scan.nextInt();
				if(menu_num<0 || menu_num>20 || quant<0 || quant>20) {
					System.out.println("INVALID INPUT");
					System.exit(0);
				}else {
				    result += bill(price,menu_num,quant);
				    choice = scan.next().toLowerCase();
				}
			}
			System.out.println("Total Amount: "+result+" INR");
		}
	}
}
