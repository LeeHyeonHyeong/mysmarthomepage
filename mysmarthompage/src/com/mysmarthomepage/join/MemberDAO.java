package com.mysmarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	Connection conn;	//�ڹٿ��� ����ʵ��� ��������� �ʱ�ȭ
	Statement stmt;		//�����ʾƵ� �ȴ�, �� ����������� �ʱ�ȭ�ؾ��Ѵ�.
	ResultSet rs;
	PreparedStatement pstmt;
	//�����ڸ� �̱��� �������� �����Ѵ�.
	//private ���� �����ڸ� �ٲٸ�
	//new MemberDAO() �� �۵����� �ʴ´�.
	//������ �ν��Ͻ��� �ϳ��� ����� �����̴�.
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance(){
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
	public int insertMember(MemberBean bean){
		int num = 0;
		String sql = "insert into member(id,pwd,name,age,gender)" +
				"values('?','?','?','?','?')";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getAge());
			pstmt.setString(5, bean.getGender());
			num = pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("memberDAO���� ������ �߻�!");
		}
		return num;
	}
}

