package daniel.weintraub;

import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matches = sc.nextInt();
		int length = (int) Math.sqrt(Math.pow(sc.nextInt(), 2)+Math.pow(sc.nextInt(), 2));
		for(int i = 0; i < matches; i++){
			if(sc.nextInt()<=length){
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		

	}

}
