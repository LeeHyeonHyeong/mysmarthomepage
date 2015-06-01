package com.mysmarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysmarthomepage.util.DBmanager;

public class UpdateMemberInfoDAO {
	Connection conn;	//�ڹٿ��� ����ʵ��� ��������� �ʱ�ȭ
	Statement stmt;		//�����ʾƵ� �ȴ�, �� ����������� �ʱ�ȭ�ؾ��Ѵ�.
	ResultSet rs;
	PreparedStatement pstmt;
	
	private UpdateMemberInfoDAO() {
		conn = DBmanager.getConnection();
	}
	private static UpdateMemberInfoDAO instance = new UpdateMemberInfoDAO();
	public static UpdateMemberInfoDAO getInstance(){
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
	public void updateMemberInfo(String id, String name, String age){
		String sql ="";
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("UpdateMemberInfoDAO 에서 에러발생!!");
		}
	}
}
