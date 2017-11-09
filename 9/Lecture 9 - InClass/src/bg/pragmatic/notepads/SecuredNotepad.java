package bg.pragmatic.notepads;

import java.util.Scanner;

import bg.pragmatic.exceptions.PageNumberException;

public class SecuredNotepad extends SimpleNotepad {
	private String password;
	
	public SecuredNotepad(String password) {
		this.password = password;
	}

	
	private boolean checkPassword() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Please enter your password: ");
			String writtenPassword = scan.nextLine();
			if(writtenPassword.equals(this.password)) {
				return true;
			}
			System.out.println("Please try again!");
		}
		System.out.println("Wrong password after 3 attempts");
		return false;
	}
	
	@Override
	public void createPage(String title, String text) {
		if(checkPassword()) {
			super.createPage(title, text);
		} else {
			System.out.println("This operation won't be performed.");
		}
	}

	@Override
	public void replacePageText(int pageNumber, String text) throws PageNumberException {
		if(checkPassword()) {
			super.replacePageText(pageNumber, text);
		} else {
			System.out.println("This operation won't be performed.");
		}
	}

	@Override
	public void deletePageText(int pageNumber) throws PageNumberException {
		if(checkPassword()) {
			super.deletePageText(pageNumber);
		} else {
			System.out.println("This operation won't be performed.");
		}
	}

	@Override
	public void previewAllPages() {
		if(checkPassword()) {
			super.previewAllPages();
		} else {
			System.out.println("This operation won't be performed.");
		}
	}
	
	
}
