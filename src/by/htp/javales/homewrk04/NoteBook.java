package by.htp.javales.homewrk04;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	List<Note> notes;

	public NoteBook() {
		notes = new ArrayList<Note>();
	}

	public void addNote(Note newNote) {
		notes.add(newNote);
	}

	public void printNoteBook() {
		for (Note printNote : notes) {
			printNote.printNote();
		}
	}

	public void findNote(String findString) {
		for (Note findNote : notes) {
			if (findNote.findText(findString)) {
				findNote.printNote();
			}
		}

	}

}
