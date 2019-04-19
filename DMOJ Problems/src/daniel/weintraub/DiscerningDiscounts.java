package daniel.weintraub;

import java.util.Scanner;

public class DiscerningDiscounts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numItems = sc.nextInt();
		int threshold = sc.nextInt();
		int counter = 0;
		for(int i = 0; i < numItems; i++){
			int price = sc.nextInt();
			int discount = sc.nextInt();
			int cost = price - (int)(price*(discount/100.0f));
			if(cost <= threshold){
				counter+=1;
			}
		}
		System.out.println(counter);

	}

}
