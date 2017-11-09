import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {
	public static void main(String[] args) {
		Map<String, Person> phoneBook = new HashMap<>();
		
		Person ivan = new Person("Ivan", 12, 70);
		Person maria = new Person("Maria", 20, 50);
		
		
		phoneBook.put("Ivan Avtomontiora", ivan);
		phoneBook.put("Maria Advokatkata", maria);
		
		Collection<Person> allPersons = phoneBook.values();
		
		System.out.println(allPersons.toString());
		
		Set<String> allKeys = phoneBook.keySet();
		
		System.out.println(allKeys.toString());
		
		Set<Entry<String, Person>> allEntries = phoneBook.entrySet();
		
		for (Entry<String, Person> entry : allEntries) {
			System.out.println("There is a person with key: " + entry.getKey() + " and a value:" + entry.getValue().toString());
		}
	}
}
