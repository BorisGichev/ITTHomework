package leters;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CountLetters implements ICountLetters {

	static private Map<Character, Container> col = new HashMap<Character, Container>();

	public void count(String text) throws InvalidStringExceptio {
		if (text == null || text.trim().length() == 0) {
			throw new InvalidStringExceptio("Invalid input String you Human.");

		}

		System.out.println(text);
		text = text.toUpperCase().trim();
		for (int index = 0; index < text.length(); index++) {
			Character letter = text.charAt(index);
			if (letter >= 'A' && letter <= 'Z') {
				Container temp = new Container(text.charAt(index));
				if (!col.containsKey(letter)) {
					col.put(letter, temp);
					continue;
				}
				col.get(letter).increment();

			}

		}

		printSortedAnddiagram(col);

	}

	public void printSortedAnddiagram(Map<Character, Container> map) {
		int mostTimesEncountered = 0;
		Collection<Container> values = new TreeSet<Container>();

		for (Character key : map.keySet()) {
			values.add(map.get(key));
			if (map.get(key).getCount() > mostTimesEncountered) {
				mostTimesEncountered = map.get(key).getCount();
			}

		}
		for (Container con : values) {
			System.out.print(con);
			con.ptintMarker(mostTimesEncountered);

		}
	}

}
