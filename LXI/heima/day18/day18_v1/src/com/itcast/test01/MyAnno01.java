package com.itcast.test01;

//�Զ���һ��ע��
public @interface MyAnno01 {
	//��ע���ж���һ������
	public long timeout() default -1;
	
	public  Class c() default java.util.Date.class;
	
	//public  MyAnno02 ma();
	
	public String[] strs();
	
	//����:ԭ��:���Բ�֧���Զ���������
	//public TestAnnotation  aa();
	
	//ע�������֧�ֵ�������:������������(4��8��),String,Class,Annotation(ע������),ö������,�Լ��������͵�һά��������
}
