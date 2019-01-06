package com.itcast.test02;

import java.lang.reflect.Method;

public class MyJunit {
	public static void main(String[] args) throws Exception {
		//����UserDao.class�ֽ����ļ��еķ���,�ж���Щ���������Զ����ע��@MyTest,�����ǰ�ķ�����@MyTest,ִ��,����ִ��
		
		//1_��UserDao.class�ֽ����ļ����ص��ڴ��� ,class����(�����ֽ����ļ����ڴ��еĶ���)
		Class clazz=Class.forName("com.itcast.test02.UserDao");
		
		Class claszz01=UserDao.class;
		Class claszz02=new UserDao().getClass();
		
		//2_��ȡ�ֽ�����������еķ���,����Method�������,�����е�ÿһ��Ԫ�ض�����Method����(�൱���ֽ����ϵ�ÿһ������)
		Method[] mds = clazz.getMethods();
		//3_�����ֽ�����������еķ���
		for (Method md : mds) {
			//���Է���������
			//System.out.println(md.getName());
			//�жϵ�ǰ�������Ƿ���@MyTestע����Ϣ
			//System.out.println(md.isAnnotationPresent(MyTest.class));
			if(md.isAnnotationPresent(MyTest.class)){
				//�����ǰ�ķ�������@MyTestע��,ִ��,�������
				md.invoke(new UserDao());
			}
			
		}
	}
}
