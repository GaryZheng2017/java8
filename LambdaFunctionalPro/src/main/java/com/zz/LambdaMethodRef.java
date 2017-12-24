package com.zz;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.junit.Test;

/**
 *当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *（实现抽象方法的参数列表，必须与方法引用方法的参数列表保持一致！）
 *方法引用：使用操作符 “::” 将方法名和对象或类的名字分隔开来。 如下三种主要使用情况：
 *  
 *  对象::实例方法
 *  类::静态方法
 *  类::实例方法
 */
public class LambdaMethodRef {
	//对象::实例方法
	@Test
	public void test1(){
		Consumer<String> con1 = (x) -> System.out.println(x);
		con1.accept("测试");
		
		Consumer<String> con2 = System.out::println;
		con2.accept("对象实例方法");
		
	}
	
	/**
	 * 类::静态方法
	 */
	@Test
	public void test2(){
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
		com.compare(3, 4);
		
		Comparator<Integer> com1 = Integer::compare;
		com1.compare(4,3);
	}
	
	/**
	 * 类::实例方法名
	 * （若Lambda参数列表的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时，
	 * 可以使用，类名::实例方法名）
	 */
	@Test 
	public void test3(){
		BiPredicate<String, String> bp = (x,y) -> x.equals(y);
		System.out.println(bp.test("a","a")); 
		
		BiPredicate<String,String> bp2 = String::equals;
		System.out.println(bp2.test("a","a"));
	}
}
