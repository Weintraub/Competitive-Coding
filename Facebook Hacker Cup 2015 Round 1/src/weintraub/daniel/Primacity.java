package weintraub.daniel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primacity {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int loop = Integer.parseInt(temp[0]);

		for (int i = 0; i < loop; i++) {
			temp = br.readLine().split(" ");
	        int rangeStart = Integer.parseInt(temp[0]);
	        int rangeEnd = Integer.parseInt(temp[1]);
			int primacity = Integer.parseInt(temp[2]);

			int counter = 0;
			for (int j = rangeStart; j <= rangeEnd; j++) {
				if (primeFactors(j) == primacity) {
					counter += 1;
				}
			}
			System.out.println("Case #" + (i+1) + ": " + counter);
		}
		

	}

	private static int primeFactors(int number) {
		int n = number;
		boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]){
            	if(n%i==0){
            		counter += 1;
            	}
            }
        }
        return counter;
	}

}
