package com.mxk.spring.type;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


import lombok.Setter;

@Setter
public class DataType
{
	private String specialCharacter1;	//特殊字符值1
	private String specialCharacter2;	//特殊字符值2
	private User innerBean;		//javaBean类型
	private List<String>list;		//list类型
	private String[] array;
	private Set<String> set;		//set类型
	private Map<String ,String> map;		//Map类型
	private Properties prop;	//Properties类型
	private String emptyValue;	//注入空字符串
	private String nullValue="init null";	//注入null值

	public void printValue()
	{
		PrintStream out=System.out;
		out.println("特殊字符1：" + this.specialCharacter1);
		out.println("特殊字符2：" + this.specialCharacter2);
		out.println("内部Bean：" + this.innerBean);
		out.println("List属性：" + this.list);
		out.println("数组属性：" + this.array);
		
		out.println("Set属性：" + this.set);
		out.println("Map属性：" + this.map);
		
		out.println("Properties属性：" + this.prop);
		out.println("注入空字符串：[" + this.emptyValue + "]");
		out.println("注入null值： " + this.nullValue);
	}
}
