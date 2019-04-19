package daniel.weintraub;

import java.util.Scanner;

public class BestFish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casper = sc.nextInt();
		int casMax = 0;
		for(int i = 0; i < casper; i++){
			int length = sc.nextInt();
			int weight = sc.nextInt();
			int fish = length*weight;
			if(fish>casMax){
				casMax = fish;
			}
		}
		int natalie = sc.nextInt();
		int natMax = 0;
		for(int i = 0; i < natalie; i++){
			int length = sc.nextInt();
			int weight = sc.nextInt();
			int fish = length*weight;
			if(fish>natMax){
				natMax = fish;
			}
		}
		if(casMax>natMax){
			System.out.println("Casper");
		} else if(natMax > casMax){
			System.out.println("Natalie");
		} else {
			System.out.println("Tie");
		}
		
		
		

	}

}
