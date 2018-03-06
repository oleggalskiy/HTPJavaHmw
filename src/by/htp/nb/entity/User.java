package by.htp.nb.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idUser;
	private String nickName;
	private String hashPassword;
	
	public User() {
		super();
	}
	
	public String getNickName() {
		return nickName;
	}

	public String getHashPassword() {
		return hashPassword;
	}

	public User(int _idUser, String _nickName, String _hashPassword) {
		
		this.idUser = _idUser;
		this.nickName = _nickName;
		this.hashPassword = _hashPassword;
	}

	public int getIdUser() {
		return idUser;
	}
	
	

	
	
}
