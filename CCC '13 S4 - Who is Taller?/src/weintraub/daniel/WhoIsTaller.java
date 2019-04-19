package weintraub.daniel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WhoIsTaller {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPeople = sc.nextInt();
		int numComparisons = sc.nextInt();
		
		ArrayList<HashSet<Integer>> students = new ArrayList<>();
		//students.add(0, new HashSet<Integer>());
		
		
		for(int i = 0; i < numComparisons; i++){
			int tall = sc.nextInt();
			int small = sc.nextInt();
	
			
			if (students.get(tall) == null)
			{
				students.add(tall, new HashSet<Integer>());
			} 
			students.get(tall).add(small);
		}
		int startNode = sc.nextInt();
		int findNode = sc.nextInt();
		
		best
		
	}

}
