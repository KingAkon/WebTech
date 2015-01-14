package model;

public class Spiel {

	private int spielid;
	private String ersteller;
	
	
	public Spiel(int spielid, String ersteller) {
		super();
		this.spielid = spielid;
		this.ersteller = ersteller;
	}
	

	public String getErsteller() {
		return ersteller;
	}


	public void setErsteller(String ersteller) {
		this.ersteller = ersteller;
	}


	public void setSpielid(int spielid) {
		this.spielid = spielid;
	}
	
	public int getSpielid(){
		return spielid;
	}
	
}
