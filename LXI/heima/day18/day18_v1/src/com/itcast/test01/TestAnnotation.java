package com.itcast.test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * The <code>String</code> class represents character strings. All
 * string literals in Java programs, such as <code>"abc"</code>, are
 * implemented as instances of this class.
 * <p>
 * Strings are constant; their values cannot be changed after they
 * are created. String buffers support mutable strings.
 * Because String objects are immutable they can be shared. For example:
 * <p><blockquote><pre>
 *     String str = "abc";
 * </pre></blockquote><p>
 * is equivalent to:
 * <p><blockquote><pre>
 *     char data[] = {'a', 'b', 'c'};
 *     String str = new String(data);
 * </pre></blockquote><p>
 * Here are some more examples of how strings can be used:
 * <p><blockquote><pre>
 *     System.out.println("abc");
 *     String cde = "cde";
 *     System.out.println("abc" + cde);
 *     String c = "abc".substring(2,3);
 *     String d = cde.substring(1, 2);
 * </pre></blockquote>
 * <p>
 * The class <code>String</code> includes methods for examining
 * individual characters of the sequence, for comparing strings, for
 * searching strings, for extracting substrings, and for creating a
 * copy of a string with all characters translated to uppercase or to
 * lowercase. Case mapping is based on the Unicode Standard version
 * specified by the {@link java.lang.Character Character} class.
 * <p>
 * The Java language provides special support for the string
 * concatenation operator (&nbsp;+&nbsp;), and for conversion of
 * other objects to strings. String concatenation is implemented
 * through the <code>StringBuilder</code>(or <code>StringBuffer</code>)
 * class and its <code>append</code> method.
 * String conversions are implemented through the method
 * <code>toString</code>, defined by <code>Object</code> and
 * inherited by all classes in Java. For additional information on
 * string concatenation and conversion, see Gosling, Joy, and Steele,
 * <i>The Java Language Specification</i>.
 *
 * <p> Unless otherwise noted, passing a <tt>null</tt> argument to a constructor
 * or method in this class will cause a {@link NullPointerException} to be
 * thrown.
 *
 * <p>A <code>String</code> represents a string in the UTF-16 format
 * in which <em>supplementary characters</em> are represented by <em>surrogate
 * pairs</em> (see the section <a href="Character.html#unicode">Unicode
 * Character Representations</a> in the <code>Character</code> class for
 * more information).
 * Index values refer to <code>char</code> code units, so a supplementary
 * character uses two positions in a <code>String</code>.
 * <p>The <code>String</code> class provides methods for dealing with
 * Unicode code points (i.e., characters), in addition to those for
 * dealing with Unicode code units (i.e., <code>char</code> values).
 *
 * @author  ����1
 * @author  ����2
 * @author  ����3
 * @author  ����4
 * @see     java.lang.Object#toString()
 * @see     java.lang.StringBuffer
 * @see     java.lang.StringBuilder
 * @see     java.nio.charset.Charset
 * @since   JDK1.0
 */
@SuppressWarnings({ "unused", "rawtypes" })
public class TestAnnotation {
	
	//����ע��ĺ�����:������ǰ�ķ�������д����ķ���
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	public void test01(){
		//����ע��ĺ�����:���Ʊ���������������Ϣ
		//@SuppressWarnings("unused")
        int i;
		//����ע��ĺ�����:���Ʊ���������������Ϣ(����б���δʹ��,δ��ѭ���͸�ʽ���󲻱�����)
		//@SuppressWarnings({ "unused", "rawtypes" })
		List a=new ArrayList();
	}
	
	//����ע��ĺ�����:�������µķ����ǹ�ʱ�ķ���,��������ʹ��
	@Deprecated
	public void test02(){
		
	}
	
	//����ע��ĺ�����:�����ǰ������ִ��ʱ�䳬��1��,�ᱨ��
	@Test(timeout=1000)
	public void test03(){
		try {
			Thread.sleep(1100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DDDDDDDDDDDDD");
	}
	
	
}