package daniel.weintraub;

import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> uniques = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			int num = sc.nextInt()%42;
			if(!uniques.contains(num)){
				uniques.add(num);
			}
		}
		System.out.println(uniques.size());

	}

}
