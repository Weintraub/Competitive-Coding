package daniel.weintraub;

import java.util.Scanner;

public class LeadingBasicShots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		String direction = sc.next();
		int offPoint = sc.nextInt();
		switch(direction){
		case "Infront":
			System.out.println(distance-offPoint);
			break;
		case "Behind":
			System.out.println(distance+offPoint);
			break;
			
		}
		

	}

}
