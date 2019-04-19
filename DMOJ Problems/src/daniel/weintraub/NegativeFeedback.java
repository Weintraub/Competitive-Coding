package daniel.weintraub;

import java.util.Scanner;

public class NegativeFeedback {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextFloat() * (1 + sc.nextFloat()/sc.nextFloat()));

	}

}
