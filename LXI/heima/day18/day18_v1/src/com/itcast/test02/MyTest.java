package com.itcast.test02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�Զ���ע��,�൱��JUnit@Test

//����ע���ʱ��,��Ҫͨ��Ԫע��Retention˵����ǰ�Զ���ע���������(Class,Source,Runtime)
@Retention(RetentionPolicy.RUNTIME)
//����ע���ʱ��,��Ҫͨ��Ԫע��Target˵����ǰ���Զ���ע���Ŀ�����
@Target(ElementType.METHOD)
public @interface MyTest {
	//��MyTestע���ж����Ա����,Ĭ��ֵΪ-1
	public long timeout() default -1;
}
