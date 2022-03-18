package com.example.demo.util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class DbConnection {
	public static Connection getOracleConnection() {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver"); //| ClassNotFoundException
//			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			String fileName ="DbConnection.properties";
			InputStream inStream=DbConnection.class.getClassLoader().getResourceAsStream(fileName);
			Properties props=new Properties();
			props.load(inStream);
			con=DriverManager.getConnection(
				   props.getProperty("datasource.oracle.url"), 
				   props.getProperty("datasource.oracle.username"), 
				   props.getProperty("datasource.oracle.password")
				   );

		} catch (SQLException |IOException e) {
			e.printStackTrace();		
		}
		return con;
	}
	public static Connection getPostgresConnection() {
		Connection con = null;
		try {
//			Class.forName("org.postgresql.Driver"); //| ClassNotFoundException
//			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			String fileName ="DbConnection.properties";
			InputStream inStream=DbConnection.class.getClassLoader().getResourceAsStream(fileName);
			Properties props=new Properties();
			props.load(inStream);
			con=DriverManager.getConnection(
				   props.getProperty("datasource.postgres.url"), 
				   props.getProperty("datasource.postgres.username"), 
				   props.getProperty("datasource.postgres.password")
				   );

		} catch (SQLException |IOException e) {
			e.printStackTrace();		
		}
		return con;
	}
}