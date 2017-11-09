package bg.pragmatic.notepads.structure;

public class Page {
	private String title = "";
	private String text = "";
	private int pageNumber;
	
	public void addText(String text) {
		this.text += text;
		//this.text = this.text + text;
	}
	
	public void addTitle(String title) {
		this.title += title;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void deleteText() {
		this.text = "";
	}
	
	public String showPageContent() {
		return this.title + "\n" + this.text;
	}
}