package daniel.weintraub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class PatternGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			int length = sc.nextInt();
			int numOnes = sc.nextInt();
			String myNumber = "";
			for (int j = 0; j < numOnes; j++) {
				myNumber += "1";
			}
			for (int j = 0; j < length - numOnes; j++) {
				myNumber += "0";
			}
			System.out.println("The bit patterns are");
			ArrayList<String> permuts = new ArrayList<>();
			printBalanced(myNumber);
			System.out.println("");
		}
	}

	public static void printBalanced(String word) {
		String letters = word;
		SortedSet<String> results = balanced("", letters);
		Iterator<String> it = results.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
	}

	private static SortedSet<String> balanced(String prefix, String s) {
		SortedSet<String> set = new TreeSet<String>();
		int len = s.length();
		if (len == 0) {
			set.add(prefix);
			return set;
		} else {
			SortedSet<String> rest = new TreeSet<String>();
			for (int i = 0; i < len; i++) {
				rest = balanced(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, len));
				set.addAll(rest);
			}
			return set;
		}
	}
}
