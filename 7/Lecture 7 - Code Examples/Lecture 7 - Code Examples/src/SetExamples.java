import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		System.out.println(names.add("Ivan"));
		names.add("Stefan");
		System.out.println(names.add("Maria"));
		names.add("Tania");
		System.out.println(names.add("Ivan"));
		System.out.println(names.add("Maria"));
		
//		for (String currentString : names) {
//			System.out.println(currentString);
//		}
		
		Set<String> names2 = new HashSet<>();
		names2.add("Ivan");
		names2.add("Georgi");
		names2.add("Pesho");
		names2.add("Valentina");
		names2.add("Vladimir");
		
		//razlika
		
		System.out.println(names.addAll(names2));
		
		for (String currentString : names) {
			System.out.println(currentString);
		}
		
		
		
	}
}
