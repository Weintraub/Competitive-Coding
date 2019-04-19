package weintraub.daniel;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "very";
		int pizzaWidth = sc.nextInt();
		int cheeseExtra = sc.nextInt();
		
		if(pizzaWidth == 3 && cheeseExtra >= 95){
			answer = "absolutely";
		} else if (pizzaWidth == 1 && cheeseExtra <= 50){
			answer = "fairly";
		}
		System.out.println("C.C. is " + answer + " satisfied with her pizza.");

	}

}
