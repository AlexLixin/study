package com.itcast.test01;

//����ʹ���Զ���ע��
public class TestUserAnnotation {
	@MyAnno01(timeout=100,c=java.util.Date.class,strs={"aaa","bbb"})
	public void test01(){}
}
