package daniel.weintraub;

import java.util.Scanner;

public class ANewChapter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int amount = sc.nextInt();
		for(int i = 0; i< amount; i++){
			if(i%2 == sc.nextInt()%2){
				counter++;
			}
		}
		System.out.println(counter);

	}

}
