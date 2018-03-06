package by.htp.nb.dao;

import java.io.IOException;
import java.util.GregorianCalendar;

import by.htp.nb.dao.impl.FileNoteDAO;
import by.htp.nb.entity.Note;

public class FileNoteDAOTest {

	public static void main(String[] args) {
		Note note1 = new Note(1234, "note1", new GregorianCalendar());
		Note note2 = new Note(1234, "note2", new GregorianCalendar());
		Note note3 = new Note(1234, "note3test", new GregorianCalendar());
		Note note4 = new Note(1234, "note4test", new GregorianCalendar());
		
		NoteDAO noteDAO = new FileNoteDAO();
		try {
			noteDAO.add(note1);
			noteDAO.add(note2);
			noteDAO.add(note3);
			noteDAO.add(note4);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
