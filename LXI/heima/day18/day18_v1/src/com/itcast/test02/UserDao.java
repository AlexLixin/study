package com.itcast.test02;

public class UserDao {
	
	static{
		System.out.println("���ؾ�̬����ε���Ϣ");
	}
	
	@MyTest
	public void addUser(){
		System.out.println("�����û�");
	}
	@MyTest
	public void delUser(){
		System.out.println("ɾ���û�");
	}
	@MyTest
	public void uptUser(){
		System.out.println("�����û�");
	}
	public void getUser(){
		System.out.println("��ȡ�û�");
	}
}
