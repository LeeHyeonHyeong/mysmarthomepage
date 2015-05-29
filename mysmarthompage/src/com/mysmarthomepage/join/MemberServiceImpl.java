package com.mysmarthomepage.join;

import com.mysmarthomepage.join.MemberBean;

import com.mysmarthomepage.join.MemberServiceImpl;

public class MemberServiceImpl implements MemberService{
	private MemberServiceImpl() {}
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance(){
		return instance;
	}

	
	@Override
	public int joinMember(MemberBean bean) {
		
		
		 /* �̱��� ���� : �ټ��� �ν��Ͻ��� �����ϸ� �޸� �������� ��������
		 * �ӵ��� �������ų� ���α׷��� ���ߴ� ������ �����.
		 * �װ� �����ϱ� ���� �� �ϳ��� �ν��ϸ� ����� ���� �̱��� ������ ����Ѵ�.*/
		 
		return MemberDAO.getInstance().insertMember(bean);
	}

}
