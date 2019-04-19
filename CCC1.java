import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int villages = sc.nextInt();
		float min = 1000000000;
		ArrayList<Integer> towns = new ArrayList<>();
		for(int i = 0; i < villages; i++){
			towns.add(sc.nextInt());
		}
		towns.sort(null);
		for(int i = 1; i<villages-1;i++){
			int left = towns.get(i-1);
			int middle = towns.get(i);
			int right = towns.get(i+1);
			float diff = left+middle;
			float distanceLeft = diff/2 -left;
			diff = middle+right;
			float distanceRight = diff/2 - middle;
			float total = (distanceRight + distanceLeft);
			if(total < min){
				min = total;
			}
		}
		System.out.println(min);

	}

}
