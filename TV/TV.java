/*A customer has a choice to buy TV from set of 3 company models provided by store.

If customer take an exchange offer.
Then customer get discount of 2% is old TV is not in working condition
Customer gets discount of 20% if old TV is in working condition

If customer do not opt for exchange offer then, he has to pay MRP of TV as amount
Display the amount of customer has to pay.
Menu for TV condition should be displayed only if customer choose for exchange offer
When user enters invalid option then code should stop with message “INVALID INPUT”, it should be displayed in same format as it is case sensitive.
Make sure output text should be in exact format mentioned above
Assume following List is already seen by customer, There should be 3 inputs for each question whose answer should be a number given with that choice.

First input choice
Display List (Select TV Model)
1. Samsung 10000
2. Onida 7000
3. HDLC 6000
Second Input Choice
Want to take Exchange Offer
1. Yes
2. No
Third Input Choice
Current Condition of customer’s old TV
1. Working
2. Not Working

For example, if customer want TV HDLC and he want to opt exchange offer for his old TV which is in working condition then output will be 4800.0 INR
All input values should be entered in Following Format
3
1
1
Output 4800.0 INR

Note that when customer do not opt for exchange offer, there will be only 2 inputs.*/

import java.util.Scanner;
public class TV {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] model_price = {10000,7000,6000};
		int model = scan.nextInt();  //read model number
		int exchange = scan.nextInt();  //read if customer wants to take exchange offer or not
		if(exchange==1) {  //if yes,value will be decided on whether tv is working or not
			int condition = scan.nextInt();
			double total;
			if(condition==1) {
				//if working, 20% discount given
				total = model_price[model-1] - model_price[model-1]*20/100;
				System.out.println(total+" INR");
			}else if(condition==2) {
				//if not working, 2% dicount given
				total = model_price[model-1] - model_price[model-1]*2/100;
				System.out.println(total+" INR");
			}
		}else if(exchange==2){  //if no, then display mrp as final output
			System.out.println((double)model_price[model-1]+" INR");
		}
	}
}
