/*FULLY AUTOMATIC VENDING MACHINE
 *Fully Automatic Vending Machine dispenses your cuppa on just press of button
 *A vending machine can serve range of products as follows:
 *Coffee
 *1. Expresso Coffee
 *2. Cappuccino Coffee
 *3. Latte Coffee
 *
 * Tea
 * 1. Plain Tea
 * 2. Assam Tea
 * 3. Ginger Tea
 * 4. Cardamom Tea
 * 5. Masala Tea
 * 6. Lemon Tea
 * 7. Green Tea
 * 8. Organic Darjeeling Tea
 * 
 * Soups
 * 1. Hot and Sour Soup
 * 2. Veg Corn Soup
 * 3. Tomato Soup 
 * 4. Spicy Tomato Soup
 * 
 * Beverages
 * 1. Hot Chocolate Drink
 * 2. Badam Drink 
 * 3. Badam-Pista Drink 
 * 
 * Write a program to take input for menu & sub menu and display the name of sub menu selected in following format(enter the first letter to select main menu):
 * Welcome to CCD!
 * Enjoy your<name of sub menu>!
 * 
 * Example 1:
 * Input
 * c
 * 1
 * Output
 * Welcome to CCD!
 * Enjoy your Expresso Coffee
 * 
 * Example 2:
 * Input
 * t
 * 9
 * Output
 * INVALID OPTION!*/

import java.util.*;
public class VendingMachine {
	public static void coffee(int s) {
		String[] coffee = {"Expresso Coffee","Cappuccino Coffee","Latte Coffee"};
		if(s <= coffee.length) {
			System.out.println("Welcome to CCD!");
			System.out.println("Enjoy your "+coffee[s-1]);
		}else {
			System.out.println("INVALID OPTION!");
		}
		
	}
	public static void tea(int s) {
		String[] tea = {"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
		if(s <= tea.length) {
			System.out.println("Welcome to CCD!");
			System.out.println("Enjoy your "+tea[s-1]);
		}else {
			System.out.println("INVALID OPTION!");
		}
	}
	public static void soups(int s) {
		String[] soups = {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
		if(s <= soups.length) {
			System.out.println("Welcome to CCD!");
			System.out.println("Enjoy your "+soups[s-1]);
		}else {
			System.out.println("INVALID OPTION!");
		}
	}
	public static void bevrages(int s) {
		String [] bevrages = {"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
		if(s <= bevrages.length) {
			System.out.println("Welcome to CCD!");
			System.out.println("Enjoy your "+bevrages[s-1]);
		}else {
			System.out.println("INVALID OPTION!");
		}
	}
	public static void main(String[] args) {
		//Input from the menu
		Scanner scan = new Scanner(System.in);
		String menu = scan.nextLine().toLowerCase();
		if(menu.equals("c")) {
			int sub_menu = scan.nextInt();
			coffee(sub_menu);
		}else if(menu.equals("t")) {
			int sub_menu = scan.nextInt();
			tea(sub_menu);
		}else if(menu.contentEquals("s")) {
			int sub_menu = scan.nextInt();
			soups(sub_menu);
		}else if(menu.contentEquals("b")) {
			int sub_menu = scan.nextInt();
			bevrages(sub_menu);
		}else {
			System.out.println("INVALID OPTION!");
		}
	}
}
