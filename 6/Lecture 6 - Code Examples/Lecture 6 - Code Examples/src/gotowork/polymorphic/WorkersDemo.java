package gotowork.polymorphic;

public class WorkersDemo {

	public static void main(String[] args) {
		Worker bg = new Bulgarian();
		Worker de = new German();
		Worker gr = new Greek();
		
		WorkDispatcher workDispatcher = new WorkDispatcher();
		
		workDispatcher.makeThemWork(de);
		workDispatcher.makeThemWork(bg);
		workDispatcher.makeThemWork(gr);
	}

}
