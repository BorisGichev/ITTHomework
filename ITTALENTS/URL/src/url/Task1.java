package url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class Task1 {
	public static void main(String[] args) throws MalformedURLException,
			IOException {
		Scanner sc = new Scanner(new URL(
				"http://textfiles.com/games/arcade_c.hea").openStream());
		StringBuilder b = new StringBuilder("");
		while (sc.hasNextLine()) {
			b.append(sc.nextLine());
			b.append("\n");
		}
		sc.close();

		String[] words = b.toString().replaceAll("[^a-zA-Z ]", "")
				.toLowerCase().split("\\s+");

		Map<String, Container> mapText = new HashMap<String, Container>();

		for (int index = 0; index < words.length; index++) {
			String word = words[index];
			Container temp = new Container(word);
			if (!mapText.containsKey(word)) {
				mapText.put(word, temp);
				continue;
			}
			mapText.get(word).increment();

		}

		Collection<Container> values = new TreeSet<Container>();
		

		for (String key : mapText.keySet()) {
			values.add(mapText.get(key));

		}
//		for (Container con : values) {
//			System.out.println(con);
//			
//
//		}
		List<String> stringove=new LinkedList<String>(mapText.keySet());
		
		for (String key : stringove) {
			System.out.println(key);
		}

	}
}