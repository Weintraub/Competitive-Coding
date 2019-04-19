package daniel.weintraub;

import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] cups = {true,false,false};
		String[] order = sc.next().split("");
		for(String move : order){
			boolean tmp;
			switch(move){
			case "A":
				tmp = cups[0];
				cups[0] = cups[1];
				cups[1] = tmp;
				break;
			case "B":
				tmp = cups[1];
				cups[1] = cups[2];
				cups[2] = tmp;
				break;
			case "C":
				tmp = cups[0];
				cups[0] = cups[2];
				cups[2] = tmp;
				break;
			}
		}
		for(int i = 0 ; i < 3; i++){
			if(cups[i]){
				System.out.println(i+1);
			}
		}
		

	}

}
