package database;

import user.abstractions.User;

public class DataBase {
	User[] dataBase;

	public DataBase(int userLimitCount) {
		this.dataBase = new User[userLimitCount];
	}
	
	public User[] getDataBase() {
		return dataBase;
	}
	
	
}
