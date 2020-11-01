/*Selection of MPCS exams include a fitness test which is conducted on ground.
 * There will be a batch of 3 trainees, appearing for running test in track for 3 rounds.
 * You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee.
 * If more than one trainee attains the same highest average level, they all need to be selected.
 * Display the most fit trainee (or trainees) and the highest average oxygen level.
 * 
 * Note:
 * 1.The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
 * 2.If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit”
 * 3.Average Oxygen Values should be rounded.
 * 
 * Example 1:
 * INPUT VALUES
 * 95
 * 92
 * 95
 * 92
 * 90
 * 92
 * 90
 * 92
 * 90
 * OUTPUT VALUES
 * Trainee Number : 1
 * Trainee Number : 3
 * 
 * Note:
 * Input should be 9 integer values representing oxygen levels entered in order as
 * Round 1
 * Oxygen value of trainee 1
 * Oxygen value of trainee 2
 * Oxygen value of trainee 3
 * Round 2
 * Oxygen value of trainee 1
 * Oxygen value of trainee 2
 * Oxygen value of trainee 3
 * Round 3
 * Oxygen value of trainee 1
 * Oxygen value of trainee 2
 * Oxygen value of trainee 3
 * Output must be in the given format as in above example. For any wrong input final output should display “INVALID INPUT”
 */

import java.util.Scanner;
import java.util.ArrayList;
public class MPCS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); //to store oxygen level of each trainee
		//Recording oxygen level after each round
		int oxy;
		for(int i=1; i<=9; i++) {
			oxy = scan.nextInt();
			list.add(oxy);
		}
		//calculating the average oxygen level 
		int avg = 0;
		for(int i=0; i<list.size(); i++) {
			avg += list.get(i);
		}
		avg /= 9; 
		//finding max value
		int max = avg;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max = list.get(i);
			}
		}
		//Finding the most fit trainee
		if(avg>=70) {
			for(int i=0; i<list.size();i++) {
				if(list.get(i)==max) {
					if(i==0 || i==3 || i==6) {
						System.out.println("Trainee Number : 1");
					}
	
					if(i==1 || i==4 || i==7) {
						System.out.println("Trainee Number : 2");
					}
					
					if(i==2 || i==5 || i==8) {
						System.out.println("Trainee Number : 3");
					}
				}
			}
		}else {
			System.out.println("All trainees are unfit");
		}
	}
}
