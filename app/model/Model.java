package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Model {

	private static Model instance = null;
	private static Connection con = null;
	

	
	private ArrayList<Spiel> Spiele = new ArrayList<Spiel>();
	private ArrayList<Benutzer> Benutzer = new ArrayList<Benutzer>();
	
	public static Model getInstance(){
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}
	
	public Model(){
			
	}
	

	
	public void convertData() {
		Statement s = null;
		try{
			s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from Benutzer");
				while (rs.next())
			    {
			    	Model.getInstance().Benutzer.add(new Benutzer(rs.getString(1), rs.getInt(2)) ); 
			    }
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim Select");
		}	
		for(Benutzer iter : Model.getInstance().Benutzer){
			System.out.println("BenutzerName: " + iter.getBenutzername());
			System.out.println("BenutzerID: " + iter.getBenutzerid());
		}
		try{
			s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from Benutzer");
				while (rs.next())
			    {
			    	Model.getInstance().Benutzer.add( new Benutzer(rs.getString(1), rs.getInt(2)) ); 
			    }
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim Select");
		}	
		for(Benutzer iter : Model.getInstance().Benutzer){
			System.out.println("Nutzername: " + iter.getBenutzername());
			System.out.println("Benutzerid: " + iter.getBenutzerid());
		}
		
	}
	
	public void createConnection() {
		if(con == null){
			Connection tmp = null;
			try {
				Class.forName( "org.sqlite.JDBC" );
				tmp = DriverManager.getConnection("jdbc:sqlite:./database.db");
			} catch (ClassNotFoundException e) {
				System.out.println("Fehler bei DB-Verbindung");
				e.printStackTrace();
			} catch(SQLException e2){
				e2.printStackTrace();
				System.out.println("Fehler beim JDBC-Treiber");
			}
			con = tmp;
		}
		System.out.println("DB-Verbindung hergestellt: " + con.toString() );
	}
	
	public void createDatabase() {
		Statement s;
		try{
			s = con.createStatement();
			String createString = "create table if not exists Spiele " +
					                "(spielid int primary key," +
					                " ersteller string " + 
					                ")"; 
			s.executeUpdate(createString);
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim erstellen der Spiele-Tabelle");
		}
		try{
			s = con.createStatement();
			String createString = "create table if not exists Benutzer " +
					                "(benutzerid int primary key," +
					                " benutzername string " + 
					                ")"; 
			s.executeUpdate(createString);
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim erstellen der Benutzer-Tabelle");
		}
	}
	
	public void deleteDatabase() {
		Statement s;
		try{
			s = con.createStatement();
			String deleteString = "drop table Spiele"; 
			s.executeUpdate(deleteString);
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim Löschen der Spiele-Tabelle");
		}
		try{
			s = con.createStatement();
			String deleteString = "drop table Benutzer"; 
			s.executeUpdate(deleteString);
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim Löschen der Benutzer-Tabelle");
		}
	}
	
	public void insertData() {
		Statement s;
		String insertString;
		try{
			s = con.createStatement();
			insertString = "insert into Spiele (spielid, ersteller) values (1, 'KingAkon')";
			s.executeUpdate(insertString);
			insertString = "insert into Spiele (spielid, ersteller) values (2, 'Baron')";
			s.executeUpdate(insertString);
			
			insertString = "insert into Benutzer(benutzername, benutzerid) values ('KingAkon', 1)";
			s.executeUpdate(insertString);
			insertString = "insert into nutzer(benutzername, benutzerid) values ('Baron', 2)";
			s.executeUpdate(insertString);
			
			
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim einfügen der Daten");
		}
		
	}
	
	/*public Spiel showSpiele(String name) {
		 
		try{
			String ss = "select * from Spiele where ersteller = ? ";
			PreparedStatement ps = con.prepareStatement(ss);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
				while (rs.next())
			    {
			    	Model.getInstance().s = new Spiel(rs.getInt(1), rs.getString(2)); 
			    }
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fehler beim Select");
		}	
		return s;
	}*/
	
}

