
public class Person {
	String name;
	int age;
	double weight;
	
	public Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void walk() {
		System.out.println(this.name + " is walking");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	

}
