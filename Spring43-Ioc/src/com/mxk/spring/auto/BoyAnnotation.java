package com.mxk.spring.auto;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sun.istack.internal.logging.Logger;

//把类做一个标记，组件扫描可以扫到，将BoyAnnotation放到容器内
@Component()
//@Component("boyAnnotation")

public class BoyAnnotation
{
	private static Logger logger = Logger.getLogger(BoyAnnotation.class);
	@Autowired		//一般用这种注解的方式，也是给类对象的属性或者方法赋值
	//@Autowird 和 @Resource是一样的效果
	private UsaGirlFriend usaGirlFriend;
	private static ApplicationContext ctx;

	public UsaGirlFriend getUsaGirlFriend()
	{
		return usaGirlFriend;
	}

	// @Resource(type = UsaGirlFriend.class)
	//@Resource(name = "usaGirlFriend")	//给类里面的属性或者方法赋值
	public void setUsaGirlFriend(UsaGirlFriend usaGirlFriend)
	{
		this.usaGirlFriend = usaGirlFriend;
	}

	public static void main(String[] args)
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext-auto.xml");
		BoyAnnotation boy = (BoyAnnotation) ctx.getBean("boyAnnotation");
		logger.info(boy.usaGirlFriend.speak());
	}

}
