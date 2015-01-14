package controllers;

import models.*;
import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import play.db.*;
import java.sql.*;
import java.util.ArrayList;
import javax.management.modelmbean.ModelMBeanAttributeInfo;

public class Application extends Controller {

final static Form<Benutzer> loginForm = Form.form(Benutzer.class);
final static Form<Benutzer> signInForm = Form.form(Benutzer.class);

public static Result login(){ 
		String user = session("name");
		if(user != "Gast"){
			return ok( login.render( user, loginForm ));
		}else{
			session().remove("name");
			return ok( login.render( user, loginForm ));
		}
public static Result loginSubmit() {
	    Form<Benutzer> loginFormVoll = loginForm.bindFromRequest();
	    session().clear();
	    Model.getInstance().checkLogin(loginFormVoll.get());
	    session("name",Model.getInstance().getBenutzername());
	    String user = session("name");	    
	    if(user != "Gast" ){
		    System.out.println("Session: " + user);
	    	return ok( grundseite.render( user ));
	    }else{
	    	return redirect("/Login");
	    }
	}
public static Result logout(){
		session().clear();
		Model.getInstance().doLogout();
		session("name", Model.getInstance().getBenutzername());
		String user = session("name");
		return ok(news.render( user ));
	}

public static Result register(){
		String user = session("name");
		return ok( register.render( user, signInForm ) );
		
	}
public static Result signInSubmit(){
		Form<Benutzer> signInFormVoll = signInForm.bindFromRequest();
		Model.getInstance().doSignIn(signInFormVoll.get());
		session("name",Model.getInstance().getBenutzername());
		String user = session("name");
		if( user != "Gast" ){
			System.out.println("Erfolgreich registriert :-) ");
			return ok( grundseite.render( user ));
		}else{
			return redirect("/registrieren");
		}
	}

   
   public static Result grundseite(){
		String user = session("name");
		if(user != "Gast"){
			return ok( account.render( user ) );
		}else{
			session("name",Model.getInstance().getBenutzername());
			user = session("name");
			return ok( grundseite.render( user ) );
		}
	}
	
	}
	public static Result newgame(){
		String user = session("name");
		if(user != "Gast"){
			return ok( account.render( user ) );
		}else{
			session("name",Model.getInstance().getBenutzername());
			user = session("name");
			return ok( newgame.render( user ) );
		}
	}
		
	public static Result instructions(){
		String user = session("name");
		if(user != "Gast"){
			return ok( account.render( user ) );
		}else{
			session("name",Model.getInstance().getBenutzername());
			user = session("name");
			return ok( instructions.render( user ) );
		}
	}

	public static Result about(){
		String user = session("name");
		if(user != null){
			return ok( about.render( user ) );
		}else{
			session("name",Model.getInstance().getBenutzername());
			user = session("name");
			return ok( about.render( user ) );
		}
	}
	
	
	
	
	
}