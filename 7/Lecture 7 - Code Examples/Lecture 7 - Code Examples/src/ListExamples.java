import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		
		Person ivan = new Person("Ivan", 12, 70);
		Person maria = new Person("Maria", 20, 50);
		
		List<Person> people = new ArrayList<>();
		people.add(ivan);
		people.add(maria);
		
		for (Person currentPerson : people) {
			if(currentPerson.name.equals("Maria")) {
				currentPerson.walk();
			}
		}	
		
		
		List<String> names = new ArrayList<>();
		names.add("Ivan");
		names.add("Ivan");
		names.add("Ivan");
		names.add("Maria");
		names.add("Tania");
		names.add("Vladimir");
		
		
		
		for (String currentString : names) {
			System.out.println(currentString);
		}
		
		Iterator<String> namesIterator = names.iterator();
		
		while(namesIterator.hasNext()) {
			String currentString = namesIterator.next();
			if(currentString.equals("Ivan")) {
				namesIterator.remove();
			}
		}
		
		System.out.println(names.toString());
		
	}
}
