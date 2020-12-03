/*A travel agency is conducting a Survey for two different cities for their favourite travel destinations in Mumbai from 5 Users.
Travel destination of names of 5 countries already given. Find the most preferred favourite destination.
Display the report at the end showing the highly ranked Travel destination by the  residents as Preferred Travel Destination.

Criteria for deciding a highly ranked destination is by computing the destination being ranked as ‘1’ by most of the residents. 
Travel Destination already provided are ‘Malaysia’, ‘Australia’, ‘Germany’, ‘Dubai’, ‘France’
Rank ‘R’, 1<=R<=5

Input is integers values from range 1 to 5 representing ranking should be taken from each of 5 residents of each of 5 Travel destinations.
Output should be in format-
<String-Name of Destination>
In case of more than one preferred destinations output should be-
<String-Name of Destination>
<String-Name of Destination>

Rank should be between 1 to 5, if not “INVALID INPUT”.
Note: Do not print any input message. Directly accept the input values one below the other for all 5 users. For each user accept 5 inputs representing ranks 1 to 5 for Countries in order ‘Malaysia’, ‘Australia’, ‘Germany’, ‘Dubai’, ‘France’.

Example 1:

Input Values
1
2
3
1
2
3
5
2
1
3
1
2
3
1
1
1
1
1
1
1
1
2
2
2
2
Output Values:
Dubai
Malaysia
*/

import java.util.Scanner;
public class Travel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] ranks = new int[5][5];  //initialize ranks as a two dimensional array
		for(int i=0;i<ranks.length;i++) {
			for(int j=0;j<ranks.length;j++) {
				int r = scan.nextInt();  //read inputs
				if(r>=1 && r<=5) {
					ranks[j][i] = r;  
				}else {
					System.out.println("INVALID INPUT");
					System.exit(0);
				}
			}
		}
		int cM=0,cA=0,cG=0,cD=0,cF=0; //count rank 1 for each country
		//count rank 1 for malaysia
		for(int i=0;i<5;i++) {
			if(ranks[0][i]==1) {
				cM++;
			}
		}
		//count rank 1 for australia
		for(int i=0;i<5;i++) {
			if(ranks[1][i]==1) {
				cA++;
				
			}
		}
		//count rank 1 for germany
		for(int i=0;i<5;i++) {
			if(ranks[2][i]==1) {
				cG++;
			}
		}
		//count rank 1 for dubai
		for(int i=0;i<5;i++) {
			if(ranks[3][i]==1) {
				cD++;
			}
		}
		//count rank 1 for france
		for(int i=0;i<5;i++) {
			if(ranks[4][i]==1) {
				cF++;
			}
		}
		//determine the maximum rank 1s
		int max = Math.max(cM, Math.max(cA,Math.max(cG, Math.max(cD, cF))));
		//print the countries having max rank 1s
		if(max==cM) {
			System.out.println("Malaysia");
		}
		if(max==cA) {
			System.out.println("Australia");
		}
		if(max==cG) {
			System.out.println("Germany");
		}
		if(max==cD) {
			System.out.println("Dubai");
		}
		if(max==cF) {
			System.out.println("France");
		}
	}
}
