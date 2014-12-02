package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	public static Result main(){
		return ok(main.render());
		
	}	
	public static Result instructions() {
		return ok(instructions.render());
	
	}
	public static Result options() {
		return ok(instructions.options());
	
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
	
	
	
}