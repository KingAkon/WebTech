package model;

public class Spiel {

	private int spielid;
	Benutzer joiner;
	Benutzer creator;
	
	public Spiel(int spielid, Benutzer creator) {
		super();
		this.spielid = spielid;
		this.creator = creator;
	}
	

	public void setSpielid(int spielid) {
		this.spielid = spielid;
	}
	
	public int getSpielid(){
		return spielid;
	}
	
}
