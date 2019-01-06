package com.itcast.test02;

import java.lang.reflect.Method;

public class MyJunit {
	public static void main(String[] args) throws Exception {
		//加载UserDao.class字节码文件中的方法,判断哪些方法上有自定义的注解@MyTest,如果当前的方法有@MyTest,执行,否则不执行
		
		//1_将UserDao.class字节码文件加载到内存中 ,class对象(代表字节码文件在内存中的对象)
		Class clazz=Class.forName("com.itcast.test02.UserDao");
		
		Class claszz01=UserDao.class;
		Class claszz02=new UserDao().getClass();
		
		//2_获取字节码对象上所有的方法,返回Method数组对象,数组中的每一个元素都代表Method对象(相当于字节码上的每一个方法)
		Method[] mds = clazz.getMethods();
		//3_遍历字节码对象上所有的方法
		for (Method md : mds) {
			//测试方法的名称
			//System.out.println(md.getName());
			//判断当前方法上是否有@MyTest注解信息
			//System.out.println(md.isAnnotationPresent(MyTest.class));
			if(md.isAnnotationPresent(MyTest.class)){
				//如果当前的方法上有@MyTest注解,执行,否则忽略
				md.invoke(new UserDao());
			}
			
		}
	}
}
