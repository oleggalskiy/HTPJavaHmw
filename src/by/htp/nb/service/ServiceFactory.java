package by.htp.nb.service;

import by.htp.nb.service.impl.NoteServiceImpl;
import by.htp.nb.service.impl.UserServiceImpl;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	private ServiceFactory(){}
	
	private final NoteService noteService = new NoteServiceImpl();
	private final UserService userService = new UserServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public UserService getUserService(){
		return userService;
	}
	
	public NoteService getNoteService(){
		return noteService;
	}

}
