package daniel.weintraub;

import java.util.Scanner;

public class Regpo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sides = sc.nextInt();
		String exteriorAngle;
		if(sides == 3){
			exteriorAngle = "120";
		} else {
			exteriorAngle = String.format("%.6f", 360-((sides-2)*180)/sides);
		}
		System.out.println(exteriorAngle);

	}

}
