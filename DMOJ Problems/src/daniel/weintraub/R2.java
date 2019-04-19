package daniel.weintraub;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputOne = sc.nextInt();
		int mean = sc.nextInt();
		int diff = mean - inputOne;
		System.out.println(mean+diff);

	}

}
