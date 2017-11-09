package bg.pragmatic.notepads;

import java.util.ArrayList;
import java.util.List;

import bg.pragmatic.exceptions.PageNumberException;
import bg.pragmatic.notepads.abstractions.Notepad;
import bg.pragmatic.notepads.structure.Page;

public class SimpleNotepad implements Notepad {

	private List<Page> pages;
	
	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}
	
	@Override
	public void createPage(String title, String text) {
		Page page = new Page();
		page.addText(text);
		page.addTitle(title);
		this.pages.add(page);
		page.setPageNumber(this.pages.size());
		
	}

	@Override
	public void replacePageText(int pageNumber, String text) throws PageNumberException  {
		if(this.pages.size() < pageNumber) {
			throw new PageNumberException("The page doesn't exist, please fill number between" + "1 and " + this.pages.size());
		}
		
		for(Page curPage : this.pages) {
			if(curPage.getPageNumber() == pageNumber ) {
				curPage.deleteText();
				curPage.addText(text);
				break;
			}
		}
	}

	@Override
	public void deletePageText(int pageNumber) throws PageNumberException {
		if(this.pages.size() < pageNumber) {
			throw new PageNumberException("The page doesn't exist, please fill number between" + "1 and " + this.pages.size());
		}
		
		for(Page curPage : this.pages) {
			if(curPage.getPageNumber() == pageNumber ) {
				curPage.deleteText();
				break;
			}
		}
	}

	@Override
	public void previewAllPages() {
		for (Page curPage : pages) {
			System.out.println(curPage.showPageContent());
		}
	}

}
