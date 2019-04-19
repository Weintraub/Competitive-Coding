package daniel.weintraub;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i< count; i++){
			System.out.println(recursion(sc.next()));
			
		}

	}

	private static String recursion(String num) {
		if(num.length()==1){
			return num;
		} else {
	        int sum = 0;
	        for(int i = 0; i< num.length(); i++){
	        	int digit = Integer.parseInt(num.substring(i, i+1));
	        	sum += digit;
	        }
	       // System.out.println(sum);
	        return(recursion(String.valueOf(sum)));
		}
	}

}
