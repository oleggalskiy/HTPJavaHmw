package by.htp.nb.controller.impl;

import by.htp.nb.controller.Command;
import by.htp.nb.entity.Note;
import by.htp.nb.service.NoteService;
import by.htp.nb.service.ServiceFactory;
import by.htp.nb.service.exception.ServiceException;

public class CreateNoteImpl implements Command{

	@Override
	public String execute(String[] params) {
		String newContent;
		int year;
		int month;
		int day;
		
		String[] elements;
		for(int i=1; i<params.length; i++){
			elements = params[i].split("=");
			
			switch(elements[0]){
			case "newContent":
				newContent = elements[1];
			case "year":
				year = Integer.parseInt(elements[1]);
			}
			
		}
		
		ServiceFactory factory = ServiceFactory.getInstance();
		NoteService noteService = factory.getNoteService();
		
		Note newNote = new Note();
		String response;
		try {
			noteService.create(newNote);
			response = "0 OK";
		} catch (ServiceException e) {
			// log
			e.printStackTrace();
			response = "1 Error";
		}
		

		return response;
	}

}
