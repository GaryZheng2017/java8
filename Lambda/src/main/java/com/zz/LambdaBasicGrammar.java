package com.zz;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 *lambda�﷨��
 *		-> Ϊlambda���ʽ�Ĳ�����
 *		��ָࣺ���� Lambda ���ʽ��Ҫ�����в��� 
 *		�Ҳָࣺ���� Lambda �壬�� Lambda ���ʽҪִ�� �Ĺ��� 
 *lambda���ʽ�ǶԽӿڷ�����ʵ��
 *
 */
public class LambdaBasicGrammar {

	/**
	 * �﷨һ��
	 * 		�޲������޷���ֵ
	 * eg����Runnable�ӿ�run������ʵ��
	 */
	@Test
	public void test1()
	{
		Runnable r = () -> System.out.println("lambda���ʽ���޲����޷���ֵ");
		r.run();
	}
	
	/**
	 * �﷨����
	 * 		�в������޷���ֵ
	 * eg:Consumer��accept����
	 */
	@Test
	public void test2(){
		Consumer<String> con = (x) -> System.out.println("lambda���ʽ���в����޷���ֵ");
		con.accept("1");
	}

	/**
	 * �﷨����
	 * 		�в������޷���ֵ��һ������������ʡ��lambda�ģ���С���ţ�
	 * eg:Consumer��accept����
	 */
	@Test
	public void test3(){
		Consumer<String> con = x -> System.out.println("lambda���ʽ���в����޷���ֵ");
		con.accept("1");
	}
	
	/**
	 * �﷨�ģ�
	 * 		���������ϵĲ������з���ֵ����lambda�����ж������
	 * 			���õ�{}����lambda��ŵ�һ��
	 * eg��Comparator��compare����
	 */
	@Test
	public void test4(){
		Comparator<Integer> com = (x,y) -> {
			System.out.println("���������ϵĲ������з���ֵ����lambda�����ж������");
			return Integer.compare(x, y);
		};
		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
	
	/**
	 * �﷨�壺
	 * 		���������ϵĲ������з���ֵ����lambda����ֻ��һ�����
	 * 			���õ�{}��return����ʡ�ԣ�
	 * eg��Comparator��compare����
	 */
	@Test
	public void test5(){
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
	
	/**
	 * �﷨��
	 * 	Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(x, y);
	 * 	Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	 * 	Lambda ���ʽ������ָ�����ͣ�������Ȼ�� �Ա��룬������Ϊ javac ���ݳ���������ģ�
	 * 	�ں�̨ �ƶϳ��˲��������͡�Lambda ���ʽ�������������� ���Ļ��������ɱ������ƶϳ����ġ�
	 * 	�������ν�� �������ƶϡ�
	 */
	@Test
	public void test6(){
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
}
