package com.zz;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 *lambda语法：
 *		-> 为lambda表达式的操作符
 *		左侧：指定了 Lambda 表达式需要的所有参数 
 *		右侧：指定了 Lambda 体，即 Lambda 表达式要执行 的功能 
 *lambda表达式是对接口方法的实现
 *
 */
public class LambdaBasicGrammar {

	/**
	 * 语法一：
	 * 		无参数，无返回值
	 * eg：对Runnable接口run方法的实现
	 */
	@Test
	public void test1()
	{
		Runnable r = () -> System.out.println("lambda表达式，无参数无返回值");
		r.run();
	}
	
	/**
	 * 语法二：
	 * 		有参数，无返回值
	 * eg:Consumer的accept方法
	 */
	@Test
	public void test2(){
		Consumer<String> con = (x) -> System.out.println("lambda表达式，有参数无返回值");
		con.accept("1");
	}

	/**
	 * 语法三：
	 * 		有参数，无返回值（一个参数，可以省略lambda的（）小括号）
	 * eg:Consumer的accept方法
	 */
	@Test
	public void test3(){
		Consumer<String> con = x -> System.out.println("lambda表达式，有参数无返回值");
		con.accept("1");
	}
	
	/**
	 * 语法四：
	 * 		有两个以上的参数，有返回值并且lambda体中有多条语句
	 * 			（用到{}来把lambda体放到一起）
	 * eg：Comparator的compare方法
	 */
	@Test
	public void test4(){
		Comparator<Integer> com = (x,y) -> {
			System.out.println("有两个以上的参数，有返回值并且lambda体中有多条语句");
			return Integer.compare(x, y);
		};
		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
	
	/**
	 * 语法五：
	 * 		有两个以上的参数，有返回值并且lambda体中只有一条语句
	 * 			（用到{}和return可以省略）
	 * eg：Comparator的compare方法
	 */
	@Test
	public void test5(){
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
	
	/**
	 * 语法六
	 * 	Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(x, y);
	 * 	Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
	 * 	Lambda 表达式中无需指定类型，程序依然可 以编译，这是因为 javac 根据程序的上下文，
	 * 	在后台 推断出了参数的类型。Lambda 表达式的类型依赖于上 下文环境，是由编译器推断出来的。
	 * 	这就是所谓的 “类型推断”
	 */
	@Test
	public void test6(){
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);		
		int result = com.compare(3, 4);
		System.out.println(result);
	}
}
