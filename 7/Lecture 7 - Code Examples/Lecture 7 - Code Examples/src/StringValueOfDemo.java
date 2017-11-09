
public class StringValueOfDemo {

	public static void main(String[] args) {
		String a = "338";
		
		System.out.println(a + 2);
		
		Integer theIntegerValue = Integer.valueOf(a);
		
		System.out.println(theIntegerValue + 2);
		
		
		int primitiveValueOfTheNumber = Integer.parseInt(a);
		
		System.out.println(primitiveValueOfTheNumber + 2);
	}

}
