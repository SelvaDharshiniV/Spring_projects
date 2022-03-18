package com.example.demo.util;

import java.sql.Connection;

import com.example.demo.enums.DataBaseName;

public class ConnectionFactory {

	public static Connection getConnection(DataBaseName key) {
		
	switch (key) {
	case ORACLE:
		return DbConnection.getOracleConnection();
	case POSTGRES:
		return DbConnection.getPostgresConnection();
	default:
		return null;
	}
	}


}
