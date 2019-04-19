package weintraub.daniel;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int animals = sc.nextInt();
		int jobOneOpenings = sc.nextInt();
		int jobTwoOpenings = sc.nextInt();
		int jobOneTaken = 0;
		int jobTwoTaken = 0;
		int jobOneWanted = 0;
		int jobTwoWanted = 0;
		for(int i = 0; i < animals; i++){
			int job = sc.nextInt();
			if(job == 1){
				if(jobOneOpenings > jobOneTaken){
					jobOneTaken++;
					jobOneWanted++;
				} else {
					jobOneTaken++;
				}
				
			} else {
				if(jobTwoOpenings > jobTwoTaken){
					jobTwoTaken++;
					jobTwoWanted++;
				} else {
					jobTwoTaken++;
				}
			}
		}
		System.out.println(jobOneWanted + jobTwoWanted);
	}

}
