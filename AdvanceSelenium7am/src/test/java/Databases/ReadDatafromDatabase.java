package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;



public class ReadDatafromDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspiders_info","root","root");
		
		Statement stat =connection.createStatement();
		String Query = "Select * from Student_infom";
		
		Resultset Res = stat.executeUpdate(Query);
		
		
		

	}

}
