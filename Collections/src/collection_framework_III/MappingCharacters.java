package collection_framework_III;

import java.util.HashMap;
import java.util.Map;

public class MappingCharacters {
	public static void main(String[] args) {
		String str = "coccocola";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		map.forEach((Character c, Integer i) -> {
			System.out.println(c + "==>" + i);

		});

	}

}
