package model;

public class Benutzer {

	private String benutzername;
	private String password;
	
	
	
	
	//Konstruktor
	public Benutzer(String benutzername, String password) {
		super();
		this.benutzername = benutzername;
		
		this.password = password;
	}

	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public int getPassword() {
		return password;
	}
	
	
}
