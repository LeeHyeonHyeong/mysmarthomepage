package com.mysmarthomepage.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import net.syntax.part04.MemberVO;

import com.mysmarthomepage.join.RemoveDAO;
import com.mysmarthomepage.util.DBmanager;

public class LoginDAO {
	Connection conn;	//자바에서 멤버필드의 멤버변수는 초기화
	Statement stmt;		//하지않아도 된다, 단 지역변수라면 초기화해야한다.
	ResultSet rs;
	PreparedStatement pstmt;
	
	private LoginDAO() {
		conn = DBmanager.getConnection();
	}
	private static LoginDAO instance = new LoginDAO();
	public static LoginDAO getInstance(){
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
	public String login(String id){
		String pass = "";
		String sql = "select pwd from member where id = '"+id+"'";
		try{
			System.out.println("sql문 디버깅 :"+sql);
			stmt = conn.createStatement();
			rs = pstmt.executeQuery(sql);
			while(rs.next()){
				pass = rs.getString("pwd");
			}
			System.out.println("LoginDAO 에서 리턴된값 :"+pass);
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("로그인DAO에서 에러발생");
		}
		
		return pass;
	}
}









