package com.mysmarthomepage.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBmanager {
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = ("jdbc:oracle:thin:@127.0.0.1:1521:xe");
			conn = DriverManager.getConnection(url,"hr","hr");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("DB매니저에서 에러발생");
		}
		return conn;
	}
}
