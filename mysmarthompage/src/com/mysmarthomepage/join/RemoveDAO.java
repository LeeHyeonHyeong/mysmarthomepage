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
	public void removeMember(String id) {
		int num =0;
		String sql ="deleta from member where id = '"+id+"'";
		try{
			stmt = conn.createStatement();
			rs = pstmt.executeQuery(sql);
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("RemoveDAO���� �����߻�");
		}
		/*
		 * ���� �κ��� �ϼ��� ~DAO���� ���� ����ص� �����ϹǷ�
		 * �ٿ��ֵ�.. Ŭ������ ��ġ��Ų��
		 * �������� �Ʒ��� ���� Ŭ������ �´� �޼ҵ带 �����ؾ��Ѵ� ...
		 */	
	}
	public void updateMember(String id){
		String sql = "";
	}
}
