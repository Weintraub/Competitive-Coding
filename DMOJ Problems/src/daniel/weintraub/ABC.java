package daniel.weintraub;

import java.util.Arrays;
import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(numbers);
		String order = sc.next();
		checker(order.substring(0,1),numbers);
		checker(order.substring(1,2),numbers);
		checker(order.substring(2,3),numbers);
	}

	private static void checker(String letter, int[] numbers) {
		switch(letter){
		case "A":
			System.out.print(numbers[0] + " ");
			break;
		case "B":
			System.out.print(numbers[1] + " ");
			break;
		case "C":
			System.out.print(numbers[2] + " ");
			break;
		}
		
	}

}
