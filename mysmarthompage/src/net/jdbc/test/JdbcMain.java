package net.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcMain {
	public static void main(String[] args) {
		Connection conn = null;
		try{
			// ����̹� ���Ͽ� �ִ� Ŭ������ �ҷ��´�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 * @ �պκ��� DB ���� �ٸ���
			 * �� �ڵ忡���� localhost �� IP�ּ�          //�̰Źؿ� ������ �ݵ�� �Ȱ������� �ƴϹǷ� ���ο���� �˾ƾ�
			 * 1512�� ��Ʈ��ȣ
			 * xe�� SID�� �ǹ��Ѵ�.
			 */
			String driver = "jdbc:oracle:thin:@localhost:1521/xe";
			/*�����̸�*/
			String userId = "hr";
			/*�������*/
			String password = "hr";
			/*Connection �ʱ�ȭ*/
			conn = DriverManager.getConnection(driver,userId,password);
			System.out.println("���������� �����̵Ǿ����ϴ�.");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("JDBC������ �߻��߽��ϴ�.");
		}

	}

}
