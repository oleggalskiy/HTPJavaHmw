package by.htp.nb.service.impl;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import by.htp.nb.dao.DAOFactory;
import by.htp.nb.dao.NoteDAO;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.dao.impl.FileNoteDAO;
import by.htp.nb.entity.Note;
import by.htp.nb.service.NoteService;
import by.htp.nb.service.exception.ServiceException;

public class NoteServiceImpl implements NoteService{

	@Override
	public void create(Note note) throws ServiceException  {
		// data validation
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		
		try {
			noteDAO.add(note);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		
	}

	@Override
	public List<Note> find(Calendar date) {
		// TODO Auto-generated method stub
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		return null;
	}

}
