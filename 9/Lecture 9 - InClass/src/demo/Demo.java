package demo;

import bg.pragmatic.exceptions.PageNumberException;
import bg.pragmatic.notepads.ElectronicSecuredNotepad;
import bg.pragmatic.notepads.SecuredNotepad;
import bg.pragmatic.notepads.SimpleNotepad;
import bg.pragmatic.notepads.abstractions.ElectronicDevice;
import bg.pragmatic.notepads.abstractions.Notepad;

public class Demo {

	public static void main(String[] args) {
		Notepad securedNotepad = new SecuredNotepad("parola");
		ElectronicDevice elNotepad = new ElectronicSecuredNotepad("123");
		
		elNotepad.createPage("test", "testing");
		
		try {
			elNotepad.deletePageText(1);
		} catch (PageNumberException e) {
			e.printStackTrace();
		}
		
		elNotepad.previewAllPages();
		
		try {
			elNotepad.replacePageText(2, "blabla");
		} catch (PageNumberException e) {
			
			e.printStackTrace();
		}
		
		elNotepad.start();
		elNotepad.createPage("Test", "testing");
		elNotepad.createPage("Test2", "testing2");
		elNotepad.createPage("Test3", "testing3");
		elNotepad.previewAllPages();
		try {
			elNotepad.replacePageText(2, "blabla");
		} catch (PageNumberException e) {
			
			e.printStackTrace();
		}
		try {
			elNotepad.deletePageText(1);
		} catch (PageNumberException e) {
			e.printStackTrace();
		}
		elNotepad.previewAllPages();
		
		elNotepad.stop();
		elNotepad.createPage("Test4", "testing4");
		

//		securedNotepad.createPage("Title1", "Text1");
//		securedNotepad.createPage("Title2", "Text2");
//		securedNotepad.createPage("Title3", "Text3");
//		securedNotepad.createPage("Title4", "Text4");
//		securedNotepad.createPage("Title5", "Text5");		
//		
//		securedNotepad.previewAllPages();
//		
//		try {
//			securedNotepad.replacePageText(4, "Some New Text4");
//		} catch (PageNumberException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		securedNotepad.previewAllPages();
//		
//		try {
//			securedNotepad.deletePageText(4);
//		} catch (PageNumberException e) {
//			System.out.println(e.getMessage());
//		}
		
//		securedNotepad.previewAllPages();
//		Notepad belejnik = new SimpleNotepad();
//		
//		belejnik.createPage("Title1", "Text1");
//		belejnik.createPage("Title2", "Text2");
//		belejnik.createPage("Title3", "Text3");
//		belejnik.createPage("Title4", "Text4");
//		belejnik.createPage("Title5", "Text5");
//		
//		belejnik.previewAllPages();
//		System.out.println("--------------------------");
//		try {
//			belejnik.replacePageText(77, "bla");
//		} catch (PageNumberException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		belejnik.previewAllPages();
//		System.out.println("--------------------------");
//
//		try {
//			belejnik.deletePageText(4);
//		} catch (PageNumberException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		belejnik.previewAllPages();
		
	}

}
