package com.ericsson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDlEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1)loading the driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
//	2)create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ericsson", "root", "rpsconsulting");
//	3)create the statement
		Statement stmt = conn.createStatement();
//	4)execute the query // ddl->execute(),dml-->executeUpdate(),drl->executeQuery
		//stmt.execute("create table sleepingemps(eid int,ename varchar(10))");
	//	stmt.executeUpdate("insert into sleepingemps values(1,'mahesh')");
	//stmt.executeUpdate("update  sleepingemps set ename='suresh' where eid=1");
		stmt.executeUpdate("delete from sleepingemps where eid=1");
//	5)close the connection		
		conn.close();
		System.out.println("data inserted");
	}

}
