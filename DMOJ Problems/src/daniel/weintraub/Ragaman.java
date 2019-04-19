package daniel.weintraub;
// Not solved
import java.util.Scanner;

public class Ragaman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		String[] chars = "a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z".trim().split("");
		for(String c : chars){
			int count1 = word1.length() - word1.replace(c, "").length();
			int count2 = word2.length() - word2.replace(c, "").length();

			if(count1 < count2){
				System.out.println("N");
				System.exit(0);
			}
			
		}
		System.out.println("Y");

	}

}
