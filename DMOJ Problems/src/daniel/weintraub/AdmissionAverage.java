package daniel.weintraub;

import java.util.Scanner;

public class AdmissionAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int average = (sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt())/6;
		int AIF = sc.nextInt();
		int required = sc.nextInt();
		if(average+AIF>=required){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		

	}

}
