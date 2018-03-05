package by.htp.javales.homewrk04;

import java.util.Date;

public class Note {
	private int id;
	private String text;
	private Date date = new Date();

	public Note() {
		id = 0;
		text = null;
	}

	public Note(int _id, String _text) {
		id = _id;
		text = _text;
		date = new Date();
	}

	public void printNote() {
		System.out.println("--------------------------");
		System.out.println("[ID: " + id + " ]");
		System.out.println("TEXT: " + text + " ]");
		System.out.println("TEXT: " + date + " ]");

	}

	public boolean findText(String findText) {
		return	text.contains(findText);
		 

	}

}
