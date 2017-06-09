package com.mxk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test
{
	private static ApplicationContext ctx;
	
	private static void print(Object object)
	{
		System.out.println(object);
	}

	public static void test1()
	{
		Users users =new Users();
		users.setName("Teacher");
		users.setAddress("hefei");
		users.setMemo("This is my first Spring project");
		print(users);
	}
	public static void test2()
	{
		//使用ClassPathXmlApplicationContext的方法实例化Spring的上下文
		ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过ApplicationContext的getBean()方法，根据id来获取bean实例
		//下面得到的是一个Object对象
		Users users =(Users) ctx.getBean("users");//强转详见 JavaEE P532
		
		print(users);
	}
	
	public static void main(String[] args)
	{
		test1();
		test2();
	}
}