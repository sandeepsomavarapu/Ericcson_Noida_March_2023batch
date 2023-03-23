package com.ericsson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1)loading the driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
//	2)create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ericsson", "root", "rpsconsulting");
//	3)create the statement
		Statement stmt = conn.createStatement();
//	4)execute the query // ddl->execute(),dml-->executeUpdate(),drl->executeQuery
		ResultSet result = stmt.executeQuery("select * from sleepingemps");

		while(result.next())
		{			
			System.out.println(result.getInt(1)+" "+result.getString("ename"));
		}
//	5)close the connection		
		conn.close();
		System.out.println("data inserted");
	}

}