package com.mysmarthomepage.join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysmarthomepage.util.DBmanager;

public class MemberDAO {
	Connection conn;	//�먮컮�먯꽌 硫ㅻ쾭�꾨뱶��硫ㅻ쾭蹂�닔��珥덇린��
	Statement stmt;		//�섏��딆븘���쒕떎, ��吏�뿭蹂�닔�쇰㈃ 珥덇린�뷀빐�쇳븳��
	ResultSet rs;
	PreparedStatement pstmt;
	//�앹꽦�먮� �깃����⑦꽩�쇰줈 �앹꽦�쒕떎.
	//private �쇰줈 �앹꽦�먮� 諛붽씀硫�
	//new MemberDAO() 媛��묐룞�섏� �딅뒗��
	//�댁쑀���몄뒪�댁뒪瑜��섎굹留�留떎.
	private MemberDAO() {
		conn = DBmanager.getConnection();
	}
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
			System.out.println("memberDAO에서 에러가 발생!");
		}
		return num;
	}
}

