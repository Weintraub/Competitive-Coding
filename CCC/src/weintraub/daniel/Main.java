package weintraub.daniel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myGames = sc.nextInt();
		ArrayList<Integer> myDates = new ArrayList<>();
		myDates.add(0);
		ArrayList<Integer> myTeamOne = new ArrayList<>();
		ArrayList<Integer> myTeamTwo = new ArrayList<>();
		int oneTotal = 0;
		int twoTotal = 0;
		
		for(int i = 0; i < myGames; i++){
			myTeamOne.add(sc.nextInt());
		}
		for(int i = 0; i < myGames; i++){
			myTeamTwo.add(sc.nextInt());
		}
		for(int i = 0; i < myGames; i++){
			oneTotal += myTeamOne.get(i);
			twoTotal += myTeamTwo.get(i);
			if(oneTotal == twoTotal){
				myDates.add(i+1);
			}
		}
		System.out.println(Collections.max(myDates));
		sc.close();
	}

}
