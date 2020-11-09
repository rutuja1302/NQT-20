/*In one pass, Train A can start from source station at time T[0], halt at each station for h unit of time until it reaches last station at time T[n-1], where n is the positive integer representing total number of stations.
 * Given, Train A's timings
 * T[0]=10.00  T[1]=10.04  T[2]=10.09  T[3]=10.15  T[4]=10.19  T[5]=10.22
 * Now, suppose Railway Admin want to add more trains to increase the frequency.
 * So, to launch other Train B, for the same stations as of Train A's. Provided the train B starts at time t they would like to know the timings for train B.
 * The program should return a String array S(timestamps(in float) for train B at each station from first to last station like train A).
 * Note that time is represented in 24hour fashion.
 * startHour should be in range 0....23
 * startMinute should be in rang 0...59
 * Enter start time(24 Hrs)
 * 
 * Example 1:
 * 11.00
 * 11.00 11.04 11.09 11.15 11.19 11.22
 * 
 * Example 2:
 * -26.15
 * INVALID INPUT*/

import java.util.Scanner;
public class Train {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double time = scan.nextFloat();
		double[] TA = {10.00,10.04,10.09,10.15,10.19,10.22};
		double[] TB = {0.00,0.04,0.09,0.15,0.19,0.22};
		int hour;
		hour = (int)time; //11.00 will become 11
		//acc to the problem statement the startHour should be 0<=t<=23 && 0<=minutes<=59(minutes = float(time)-int(time))
		if(time>=0.00 && time<=23.00 && (time-hour<=59)) {
			double temp;
			//Update the array TB acc to the train timings of TA
			for(int i=0;i<6;i++) {
				temp = time + TB[i];
				hour = (int)temp;
				if(temp-hour>=0.60) {
					temp = temp + 0.40;
				}
				if(temp>24) {
					temp -= 24.00;
				}
				TB[i] = temp;
			}
			//displaying output
			for(int i=0;i<6;i++) {
				System.out.print(TB[i]+" ");
			}
		}else {
			System.out.println("INVALID INPUT");
		}
	}
}
