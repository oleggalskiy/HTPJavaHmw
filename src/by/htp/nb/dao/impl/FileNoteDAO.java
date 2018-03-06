package by.htp.nb.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import by.htp.nb.dao.NoteDAO;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.Note;

public class FileNoteDAO implements NoteDAO {

	@Override
	public void add(Note note) throws DAOException {
		// idUser text data
		FileWriter noteWriter = null;
		try {
			String userNoteFile = note.getIdUser() + DataSourseProperty.USER_NOTE_BASE_SOURCE_NAME;
			noteWriter = new FileWriter(userNoteFile, true);

			noteWriter.write(note.getText() + "\r\n");
		} catch (IOException e) {
			throw new DAOException("message", e);
		} finally {
			if (noteWriter != null) {
				try {
					noteWriter.close();
				} catch (IOException e) {
					// log ERROR
				}
			}
		}

	}

	@Override
	public List<Note> findWithContent(String text) throws DAOException {
		String newLine = System.getProperty("line.separator");
		String userNoteFile = DataSourseProperty.USER_NOTE_BASE_SOURCE_NAME;
		BufferedReader reader = null;
		try {

			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(userNoteFile)));
			StringBuilder result = new StringBuilder();
			String line;
			boolean eof = false;
			try {
				while ((line = reader.readLine()) != null) {
					result.append(eof ? newLine : "").append(line);
					eof = true;
					return result.toString();
				}
			} catch (IOException e) {
				throw new DAOException("message", e);

			}
		} catch (FileNotFoundException e) {

			throw new DAOException("message", e);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

					// log ERROR
				}
			}
		}
		return null;

	}
	public Note findTextNote() {
		return null;
		
	}
}
