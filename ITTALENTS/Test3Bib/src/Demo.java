import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class Demo {

	public static void main(String[] args) {
		List<ki> lybrary = new ArrayList<ki>();
		
		lybrary.add(new Magazine("Porno", "anal", 1));
		
		lybrary.add(new Magazine("Porno", "pussy", 3));
		lybrary.add(new Magazine("Asian", "mut", 1));
		lybrary.add(new Magazine("Asian", "hu", 1));
		lybrary.add(new Magazine("Porno", "pussy", 5));
		lybrary.add(new Magazine("Asian", "mut", 10));
		lybrary.add(new Magazine("Porno", "pussy", 1));
		lybrary.add(new Magazine("Asian", "hu", 2));
		lybrary.add(new Magazine("Porno", "anal", 10));
		lybrary.add(new Magazine("Porno", "anal", 11));
		
		Comparator com1=new Comparator<Magazine>() {
			@Override
			public int compare(Magazine m1,Magazine m2) {
				
				return m1.categorie.compareTo(m2.categorie);
			}
		};
		
		Comparator com2=new Comparator<Magazine>() {
			@Override
			public int compare(Magazine m1,Magazine m2) {
				
				return m1.title.compareTo(m2.title);
			}
		};
		
		Comparator com3=new Comparator<Magazine>() {
			@Override
			public int compare(Magazine m1,Magazine m2) {
				
				return m1.broj.compareTo(m2.broj);
			}
		};
		
		lybrary.sort(com3);
		lybrary.sort(com2);
		lybrary.sort(com1);
		
		
		for (ki ki : lybrary) {
			System.out.println(ki);
		}

	}

}
