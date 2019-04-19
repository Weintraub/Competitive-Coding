package weintraub.daniel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int myNumPlanks = sc.nextInt();
		Map<Integer, Integer> dict = new HashMap<>();
		int[] data = new int[myNumPlanks];
		for (int i = 0; i < myNumPlanks; i++) {
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < myNumPlanks; i++) {
			for (int j = 0; j < myNumPlanks; j++) {
				if (i == j)
					continue;
				int sum = data[i] + data[j];
				if (dict.containsKey(sum)) {
					dict.put(sum, dict.get(sum) + 1);
				} else {
					dict.put(sum, 1);
				}
				
			}
		}
		int max = 0;
		int index = 0;

		for (int key : dict.keySet()) {
			if (dict.get(key) / 2 > max) {
				max = dict.get(key) / 2;
				index = 1;
			} else if (dict.get(key) / 2 == max) {
				index++;
			}
		}
		System.out.println(max + " " + index);
		sc.close();
	}

}
