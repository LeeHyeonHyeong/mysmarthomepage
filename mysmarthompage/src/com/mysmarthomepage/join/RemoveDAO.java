package com.mysmarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysmarthomepage.util.DBmanager;

public class RemoveDAO {
	Connection conn;	//자바에서 멤버필드의 멤버변수는 초기화
	Statement stmt;		//하지않아도 된다, 단 지역변수라면 초기화해야한다.
	ResultSet rs;
	PreparedStatement pstmt;
	
	private RemoveDAO() {
		conn = DBmanager.getConnection();
	}
	private static RemoveDAO instance = new RemoveDAO();
	public static RemoveDAO getInstance(){
		return instance;
	}
	public Connection getConnection() throws Exception{
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;	
	}
	public void removeMember(String id) {
		int num =0;
		String sql ="deleta from member where id = '"+id+"'";
		try{
			stmt = conn.createStatement();
			rs = pstmt.executeQuery(sql);
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("RemoveDAO에서 에러발생");
		}
		/*
		 * 위에 부분은 완성된 ~DAO에서 같히 사용해도 무방하므로
		 * 붙여넣되.. 클래스명만 일치시킨다
		 * 다음으로 아래는 현재 클래스에 맞는 메소드를 생성해야한다 ...
		 */	
	}
	public void updateMember(String id){
		String sql = "";
	}
}
