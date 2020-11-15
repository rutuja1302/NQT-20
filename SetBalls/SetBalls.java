/*This is a basic classification problem, where a set of balls is given as SetBalls[].
 * 
 * Balls are of different colors, brands, sizes and weights. Ball description is given in the format like
 * “BrandName-Size-Weight-Color”
 * 
 * Given values for set are as follows:
 * SetBalls = [“Cosco-Small-58-Red”, “KC-Medium-95-Red”, “Stag-Big-156-Red”, “KC-Medium-95-Red”, “YSI-Small-152-Red”, “Cosco-Small-58-Red”, “KC-Big-155-Red”, “YSI-Small-52-Red”, 
 * “Cosco-Small-58-Green”, “KC-Medium-95-Green”, “Stag-Big-156-Green”, “Cosco-Small-58-Green”, “KC-Small-55-Green”, “YSI-Big-152-Green”, “KC-Big-155-Green”,“YSI-Small-52-Green”, 
 * “Cosco-Small-58-White”, “KC-Medium-95-White”, “Stag-Big-156-White”, “KC-Medium-95-White”, “KC-Big-155-White”, “KC-Medium-95-White”, “Cosco-Small-58-White”, “YSI-Big-152-White”,
 *  “KC-Big-155-White”, “Ysi-Small-52-White”]
 *  
 *  Classify the given sets based on the given input which can be one value among: Brand / Size / Weight / Color and display all new sets after classification with the criteria name  at the beginning of the set  in sorted order of Criteria.
 *  
 *  Note that weights can be treated as string values, so it may give different sorted sequence even though it’s a numeric value.
 *  For other inputs, return INVALID INPUT.
 *  */

import java.util.Scanner;
public class SetBalls {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] SetBalls = {"Cosco-Small-58-Red","KC-Medium-95-Red","Stag-Big-156-Red","KC-Medium-95-Red","YSI-Small-152-Red","Cosco-Small-58-Red","KC-Big-155-Red",
				"YSI-Small-52-Red","Cosco-Small-58-Green","KC-Medium-95-Green","Stag-Big-156-Green","Cosco-Small-58-Green","KC-Small-55-Green","YSI-Big-152-Green","KC-Big-155-Green",
				"YSI-Small-52-Green","Cosco-Small-58-White","KC-Medium-95-White","Stag-Big-156-White","KC-Medium-95-White","KC-Big-155-White","KC-Medium-95-White",
				"Cosco-Small-58-White","YSI-Big-152-White","KC-Big-155-White","Ysi-Small-52-White"};
		String[] Brand = {"Cosco","KC","Stag","YSI","Ysi"};
		String[] Size = {"Small","Medium","Big"};
		String[] Weight = {"58","95","156","152","155","52","55"};
		String[] Color = {"Red","Green","White"};
		
		String input = scan.nextLine();
		
		if(input.equals("Brand")) {
			for(int i=0;i<Brand.length;i++) {
				System.out.println(Brand[i]);
				for(int j=0;j<SetBalls.length;j++) {
					if(SetBalls[j].contains(Brand[i])) {
						System.out.println(SetBalls[j]);
					}
				}
			}
		}else if(input.equals("Size")) {
			for(int i=0;i<Size.length;i++) {
				System.out.println(Size[i]);
				for(int j=0;j<SetBalls.length;j++) {
					if(SetBalls[j].contains(Size[i])) {
						System.out.println(SetBalls[j]);
					}
				}
			}
		}else if(input.equals("Weight")) {
			for(int i=0;i<Weight.length;i++) {
				System.out.println(Weight[i]);
				for(int j=0;j<SetBalls.length;j++) {
					if(SetBalls[j].contains(Weight[i])) {
						String[] temp = SetBalls[j].split("-");
						if(temp[2].equals(Weight[i])) {
							System.out.println(SetBalls[j]);
						}
					}
				}
			}
		}else if(input.equals("Color")) {
			for(int i=0;i<Color.length;i++) {
				System.out.println(Color[i]);
				for(int j=0;j<SetBalls.length;j++) {
					if(SetBalls[j].contains(Color[i])) {
						System.out.println(SetBalls[j]);
					}
				}
			}
		}else {
			System.out.println("INVALID INPUT");
		}
	}
}
