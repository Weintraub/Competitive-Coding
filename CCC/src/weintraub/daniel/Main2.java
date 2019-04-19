package weintraub.daniel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numMeasure = sc.nextInt();
		ArrayList<Integer> data = new ArrayList<>();
		for(int i = 0; i < numMeasure; i++){
			data.add(sc.nextInt());
		}
		Collections.sort(data);
		ArrayList<Integer> firstHalf = new ArrayList<>();
		ArrayList<Integer> secondHalf = new ArrayList<>();
		
		if(data.size()%2==1){
			int x = data.size()/2 + (data.size()%2) - 1;
			for(int i = 0; i < x; i++){
			    firstHalf.add(data.get(i));
			 }
			for(int i = x; i < data.size(); i++){
			    secondHalf.add(data.get(i));
			 }
			firstHalf.add(secondHalf.get(0));
			secondHalf.remove(0);
			Collections.reverse(firstHalf);
			for(int i = 0; i < secondHalf.size(); i++){
				System.out.print(firstHalf.get(i)+ " ");
				System.out.print(secondHalf.get(i)+ " ");
			}
			System.out.println(firstHalf.get(firstHalf.size()-1));
		} else {
			int x = data.size()/2 + (data.size()%2) - 1;
			for(int i = 0; i < x; i++){
			    firstHalf.add(data.get(i));
			 }
			for(int i = x; i < data.size(); i++){
			    secondHalf.add(data.get(i));
			 }
			firstHalf.add(secondHalf.get(0));
			secondHalf.remove(0);
			Collections.reverse(firstHalf);
			for(int i = 0; i < secondHalf.size(); i++){
				System.out.print(firstHalf.get(i) + " ");
				System.out.print(secondHalf.get(i)+ " ");
			}
		}
		sc.close();
		
		

	}

}
