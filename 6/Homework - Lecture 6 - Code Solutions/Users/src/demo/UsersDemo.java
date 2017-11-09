package demo;

import user.abstractions.AdminUser;
import user.abstractions.User;
import users.implementations.AdminUserImpl;

public class UsersDemo {

	public static void main(String[] args) throws InterruptedException {
		AdminUser milen = new AdminUserImpl("milen");
		
		System.out.println("--------------------CREATIONS--------------------------");
		
		milen.createUser("gosho", true);
		User ivan = milen.createUser("ivan", false);
		ivan.login();
		milen.createUser("maria", false);
		milen.createUser("stefcho", false);
		milen.createUser("stefcho1", false);
		milen.createUser("stefcho2", false);
		milen.createUser("stefcho3", false);
		milen.createUser("stefcho4", false);
		milen.createUser("stefcho5", false);
		milen.createUser("stefcho6", false);
		milen.createUser("stefcho7", false);
		
		milen.viewAllUsers();
		
		System.out.println("----------------------DELETION------------------------");
		
		milen.deleteUser("stefcho3");
		
		milen.viewAllUsers();
	}
}
