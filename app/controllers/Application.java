package controllers;

import models.*;
import play.*;
import play.mvc.*;
import views.html.*;
import play.db.*;
import java.sql.*;

public class Application extends Controller {


private static Connection con = null;
	
	public static void startDB(){
		Model.getInstance().createConnection();
		Model.getInstance().deleteDatabase();
		Model.getInstance().createDatabase();
		Model.getInstance().insertData();	
		Model.getInstance().convertData();
	}
   
    public static Result grundseite(){
        return ok(grundseite.render());
    }
	public static Result login(){
		return ok(login.render());
	}
	public static Result newgame(){
		return ok(newgame.render());
	}
		
	public static Result instructions() {
		return ok(instructions.render());
	
	}
	public static Result options() {
		return ok(options.render());
	
	}
	public static Result register() {
		return ok(register.render());
	
	}

	public static Result about() {
		return ok(about.render());
	
	}
	
	
	
	
	
}