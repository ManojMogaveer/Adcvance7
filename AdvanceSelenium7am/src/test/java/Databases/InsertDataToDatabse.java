package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDatabse {

	public static void main(String[] args) throws SQLException {
		
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspiders_info","root","root");
		
		Statement stat =connection.createStatement();
		
		String query = "insert into student_infom(first_name,last_name,address)values('shobha','rani','goa')";
		

	}

}
