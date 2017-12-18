package com.jwang.test;

import java.util.EnumSet;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jwang.common.utils.SubjectEnum;

public class EnumTest 
{
	private static final Logger LOG = Logger.getLogger(EnumTest.class);
	
	//简单测试枚举类型的用法
	@Test
	public void testEnum1()
	{
		SubjectEnum subEnum = SubjectEnum.CHEMISTRY;
		
		LOG.info("chineseEnum:"+subEnum.getValue());
		
		LOG.info("chineseEnum:"+subEnum.getIntValue());
	}
	
	//枚举集合的用法
	@Test
	public void testEnumSet()
	{
		
		EnumSet<SubjectEnum> enumSet = EnumSet.allOf(SubjectEnum.class);
		
		for(SubjectEnum enumParam : enumSet)
		{
			LOG.info("enumParam:"+enumParam);
		}
	}
}
