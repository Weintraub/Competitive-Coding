package weintraub.daniel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int challenges = sc.nextInt();
		int trainPerDay = sc.nextInt();
		int tempChange = sc.nextInt();
		ArrayList<Integer> temps = new ArrayList<>();
		for (int i = 0; i < challenges; i++) {
			temps.add(i, sc.nextInt());
		}
		Collections.sort(temps);		
		int days = 0;
		while (true) {
			//System.out.println(temps);
			if(temps.size()==0){
				break;
			}
			days++;
			int finished = 1;
			if(temps.size()==1){
				break;
			}
			for (int i = 0; i < trainPerDay-1; i++) {
				if(temps.get(i+1)-temps.get(0) <= tempChange){
					finished++;
				} else {
					break;
				}
			}
			for(int i = 0; i < finished; i++){
				temps.remove(0);
			}
		}
		System.out.println(days);

	}

}
