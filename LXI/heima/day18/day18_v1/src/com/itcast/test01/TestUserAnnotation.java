package com.itcast.test01;

//测试使用自定义注解
public class TestUserAnnotation {
	@MyAnno01(timeout=100,c=java.util.Date.class,strs={"aaa","bbb"})
	public void test01(){}
}
