package stringTreeSet;

import java.util.*;

public class StringTreeSet {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int len1 = o1.length();
				int len2 = o2.length();
				int diff;
				if (len1 - len2 > 0)
					diff = 1;
				else if (len1 - len2 < 0)
					diff = -1;
				else if (len1 - len2 == 0) {
					diff = o1.compareTo(o2);
				} else
					diff = 0;
				return diff;
			}
		});

	}

}
