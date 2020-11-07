/*
 * Chain Marketing Organization has a scheme for income generation, through which its members generate income for themselves.
 * The scheme is such that suppose A joins the scheme and makes R and V to join this scheme  then A is Parent Member of R and V who are child Members. When any member joins the scheme then the parent gets total commission of 10% from each of its child members.
 * Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%.
 * Take name of the members joining the scheme as input
 * Display how many members joined the scheme including parent member. Calculate the Total commission gained by each members in the scheme.
 * The fixed amount for joining the scheme is Rs.5000 on which commission will be generated Scheme Amount = 5000
 * 
 * Example 1: When there are more than one child members
 * Input : (Do not give input prompts.Accept values as follows. )
 * Amit
 * Y
 * Rajesh,Virat
 * Output:(Final Output must be in format given below.)
 * TOTAL MEMBERS:3
 * COMISSION DETAILS
 * Amit: 1000 INR
 * Rajesh :250 INR
 * Virat: 250 INR
 * 
 * Example 2: When there is only one child member in the hierarchy
 * Input :
 * Amit
 * Y
 * Rajesh
 * Output:
 * TOTAL MEMBERS: 2
 * COMMISSION DETAILS
 * Amit: 500 INR
 * Rajesh: 250 INR
*/

import java.util.Scanner;
public class ChainMarketing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String parent = scan.nextLine();
		String yn = scan.nextLine().toUpperCase(); //whether parent has child: yes or no
		if(yn.equals("Y")) {
			String child = scan.nextLine();
			//child can be one member or multiple members separated by a comma
			if(child.contains(",")) {
				String[] child_members = child.split(",");
				int total_m = child_members.length + 1;  //totals members = child members + 1Parent member
				System.out.println("TOTAL MEMBERS: "+total_m);
				System.out.println("COMMISSION DETAILS");
				int p_commission = child_members.length * 500;  //10% of 1 member = 500Rs. Hence, 10% of n members = 500*n
				System.out.println(parent+": "+p_commission+" INR");
				for(int i=0;i<child_members.length;i++) {
					//to display commission of each child member
					System.out.println(child_members[i]+": 250 INR");  //each child member will get 5% = 250Rs
				}
			}else {
				System.out.println("TOTAL MEMBERS: 2");
				System.out.println("COMMISSION DETAILS");
				System.out.println(parent+": 500 INR");  //10% of only one member = 500Rs
				System.out.println(child+": 250 INR");  //5% of one member = 250Rs
			}
		}else {
			System.out.println("TOTAL MEMBERS: 1");
			System.out.println("COMMISSION DETAILS");
			System.out.println(parent+": 250 INR");  //5% of one member
		}
	}
}
