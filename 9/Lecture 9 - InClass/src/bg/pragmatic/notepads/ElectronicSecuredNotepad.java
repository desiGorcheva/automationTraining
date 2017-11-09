package bg.pragmatic.notepads;

import bg.pragmatic.exceptions.PageNumberException;
import bg.pragmatic.notepads.abstractions.ElectronicDevice;

public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice {

	boolean isOn;

	public ElectronicSecuredNotepad(String password) {
		super(password);
		
	}

	@Override
	public void start() {
		this.isOn = true;
		System.out.println("The electronic notepad is turned on.");

	}

	@Override
	public void stop() {
		this.isOn = false;
		System.out.println("The electronic notepad is turned off.");
	}

	@Override
	public boolean isStarted() {
		if (isOn) {
			return true;
		} else
		return false;
	}

	@Override
	public void createPage(String title, String text) {
		if (isStarted()) {
		super.createPage(title, text);
		} else {
			System.out.println("To create a page, please first turn the notepad on.");
		}
	}

	@Override
	public void replacePageText(int pageNumber, String text) throws PageNumberException {
		if (isStarted()) {
		super.replacePageText(pageNumber, text);
		}else {
			System.out.println("To replace a page, please first turn the notepad on.");
		}
	}

	@Override
	public void deletePageText(int pageNumber) throws PageNumberException {
		if (isStarted()) {
		super.deletePageText(pageNumber);
		}else {
			System.out.println("To delete a page, please first turn the notepad on.");
		}
	}

	@Override
	public void previewAllPages() {
		if (isStarted()) {
		super.previewAllPages();
		} else {
			System.out.println("To preview pages, please first turn the notepad on.");
		}
	}
	
	

}
