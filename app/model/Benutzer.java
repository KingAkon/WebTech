package model;

public class Benutzer {

	private String benutzername;
	private int benutzerid;
	
	
	
	
	//Konstruktor
	public Benutzer(String benutzername, int benutzerid) {
		super();
		this.benutzername = benutzername;
		
		this.benutzerid = benutzerid;
	}
	//Getter Setter bei ID kein Set -> primary key
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	
	
	public int getBenutzerid() {
		return benutzerid;
	}
	
	
}
