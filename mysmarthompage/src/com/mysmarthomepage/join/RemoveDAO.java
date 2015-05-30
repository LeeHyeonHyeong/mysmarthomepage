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
	Connection conn;	//�ڹٿ��� ����ʵ��� ��������� �ʱ�ȭ
	Statement stmt;		//�����ʾƵ� �ȴ�, �� ����������� �ʱ�ȭ�ؾ��Ѵ�.
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
	public int removeMember(MemberBean bean) {
		int num =0;
		String pass = "";
		String sql ="deleta from member where id = ?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pass = pstmt.executeQuery();
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("RemoveDAO���� �����߻�");
		}
		return num;
	}
}