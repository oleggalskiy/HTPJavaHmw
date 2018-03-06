package by.htp.nb.service;

import by.htp.nb.entity.User;
import by.htp.nb.service.exception.ServiceException;

public interface UserService {
	
	boolean logination(User user) throws ServiceException;
	
	

}
