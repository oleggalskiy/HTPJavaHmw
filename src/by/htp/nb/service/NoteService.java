package by.htp.nb.service;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import by.htp.nb.entity.Note;
import by.htp.nb.service.exception.ServiceException;

public interface NoteService {

	void create(Note note) throws ServiceException;
	List<Note> find(Calendar date) throws ServiceException;
}
