package by.htp.nb.dao;

import java.io.IOException;
import java.util.List;

import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.Note;

public interface NoteDAO {
	
	void add(Note note) throws DAOException;
	List<Note> findWithContent(String text) throws DAOException;
	//void remove(int id) throws DAOException;

}
