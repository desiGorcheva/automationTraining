

public class ScopeVariableVisibility {

	public static void main(String[] args) {
		int outer = 1;

		{
			int inner = 2;
			System.out.println("inner = " + inner);
			System.out.println("outer = " + outer);
			outer = inner;
			if(inner == 2) {
				System.out.println("yee inner e" + inner);
			}
		}

		int inner = 3;
		System.out.println("inner = " + inner);
		System.out.println("outer = " + outer);
	}

}
