package model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import play.db.DB;

public class Model {
	

private static Connection connection = DB.getConnection();
public static Model sharedInstance = new Model();

}
