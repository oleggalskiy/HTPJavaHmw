package by.htp.nb.dao;

import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.User;
import by.htp.nb.entity.UserInfo;

public interface UserDAO {
	
	boolean logination(User user) throws DAOException;
	//void edit(int id, UserInfo user) throws DAOException;

}
