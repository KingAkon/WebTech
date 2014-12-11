package model;

public class Benutzer {

	private String benutzername;
	private String vorname;
	private String nachname;
	private int benutzerid;
	
	
	
	
	//Konstruktor
	public Benutzer(String benutzername, String vorname, String nachname, int benutzerid) {
		super();
		this.benutzername = benutzername;
		this.vorname = vorname;
		this.nachname = nachname;
		this.benutzerid = benutzerid;
	}
	//Getter Setter bei ID kein Set -> primary key
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getBenutzerid() {
		return benutzerid;
	}
	
	
}
