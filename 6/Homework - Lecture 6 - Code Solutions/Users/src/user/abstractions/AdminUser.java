package user.abstractions;

public interface AdminUser extends User {
	void deleteUser(String userName);
	User createUser(String userName, boolean isAdmin);
	void viewAllUsers();
}
