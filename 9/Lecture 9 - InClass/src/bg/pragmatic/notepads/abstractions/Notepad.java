package bg.pragmatic.notepads.abstractions;

import bg.pragmatic.exceptions.PageNumberException;

public interface Notepad {
	void createPage(String title, String text);
	void replacePageText(int pageNumber, String text) throws PageNumberException;
	void deletePageText(int pageNumber) throws PageNumberException;
	void previewAllPages();
}
