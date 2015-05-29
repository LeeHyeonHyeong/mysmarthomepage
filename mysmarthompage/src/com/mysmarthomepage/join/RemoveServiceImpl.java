package com.mysmarthomepage.join;

public class RemoveServiceImpl implements RemoveService{
	public RemoveServiceImpl() {}
	private static RemoveServiceImpl instance = new RemoveServiceImpl();
	public static RemoveServiceImpl getInstance(){
		return instance;
	}
	@Override
	public int removeMember(MemberBean bean) {
		return RemoveDAO.getInstance().removeMember(bean);
		
	}

}
