package by.htp.nb.dao;

import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.dao.impl.FileUserDAO;
import by.htp.nb.entity.User;

public class FileUserDAOTest {

	public static void main(String[] args) {
		
		FileUserDAO userDAO = new FileUserDAO();
		User user1 =new User(1, "Nick", "Big");
		User user2 =new User(2, "Sam", "Small");
		User user3 =new User(3, "John", "Quick");
		User user4 =new User(4, "Mike", "Long");
		
		try {
			userDAO.addNewUser(user1);
			//userDAO.addNewUser(user2);
			//userDAO.addNewUser(user3);
			//userDAO.addNewUser(user4);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		
	}

}
