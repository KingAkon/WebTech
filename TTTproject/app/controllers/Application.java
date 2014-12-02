package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

   
    public static Result grundseite(){
        return ok(grundseite.render());
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
	public static Result pwforgotten() {
		return ok(pwforgotten.render());
	
	}
	public static Result about() {
		return ok(about.render());
	
	}
	/*public static Result kontakt() {
		return ok(kontakt.render());
		}*/
	
	
	
}