package daniel.weintraub;

import java.util.Scanner;

public class Harambe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String essay = sc.nextLine();
		String[] chars = essay.split("");
		int low = 0;
		int high = 0;
		for(int i = 0; i<chars.length; i++){
			
			if(Character.isLetter(essay.charAt(i)) && Character.isUpperCase(essay.charAt(i))){
				high++;
			} else if(Character.isLetter(essay.charAt(i)) && Character.isLowerCase(essay.charAt(i))){
				low++;
			}
		}
		if(high > low){
			System.out.println(essay.toUpperCase());
		} else if (low > high){
			System.out.println(essay.toLowerCase());
		} else {
			System.out.println(essay);
		}

	}

}
