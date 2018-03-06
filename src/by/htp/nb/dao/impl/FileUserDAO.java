package by.htp.nb.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import by.htp.nb.dao.UserDAO;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.User;

public class FileUserDAO implements UserDAO {

	@SuppressWarnings("unchecked")
	@Override
	public boolean logination(User user) throws DAOException {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(DataSourseProperty.USER_DATA_FILE))) {
			ArrayList<User> users = (ArrayList<User>) reader.readObject();
			if (users.contains(user)) {
				return true;
			} else {
				return false;
			}
		} catch (FileNotFoundException e) {
			throw new DAOException("message", e);
		} catch (IOException e) {
			throw new DAOException("message", e);
		} catch (ClassNotFoundException e) {
			throw new DAOException("message", e);
		}

	}

	
	@SuppressWarnings("unchecked")
	public boolean addNewUser(User user) throws DAOException {
		List<User> users = new ArrayList<User>();
		try (FileWriter userWriter = new FileWriter(DataSourseProperty.USER_DATA_FILE, true);
				ObjectInputStream reader = new ObjectInputStream(new FileInputStream(DataSourseProperty.USER_DATA_FILE))) {
			users = (ArrayList<User>) reader.readObject();
			if(users != null) {
			users.add(user);}

		} catch (FileNotFoundException e1) {
			throw new DAOException("message", e1);
		} catch (IOException e1) {
			throw new DAOException("message", e1);
		} catch (ClassNotFoundException e) {
			throw new DAOException("message", e);
		}

		try (ObjectOutputStream writer = new ObjectOutputStream(
				new FileOutputStream(DataSourseProperty.USER_DATA_FILE))) {
			writer.writeObject(users);
			return true;
		} catch (FileNotFoundException e) {
			throw new DAOException("message", e);
		} catch (IOException e) {
			throw new DAOException("message", e);
		}
	}
}
