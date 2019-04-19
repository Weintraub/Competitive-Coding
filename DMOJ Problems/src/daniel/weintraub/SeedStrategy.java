package daniel.weintraub;

import java.util.Scanner;

public class SeedStrategy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Return";
		int alive = sc.nextInt()*60;
		int count = sc.nextInt();
		for(int i = 0; i < count; i++){
			int level = sc.nextInt();
			int enemy = 0;
			switch(level){
			case 1:
				enemy = 30;
				break;
			case 2:
				enemy = 60;
				break;
			case 3:
				enemy = 300;
				break;
			}
			alive -= enemy;
		}
		if(alive > 0){
			answer = "Continue";
		}
		System.out.println(answer);

	}

}
