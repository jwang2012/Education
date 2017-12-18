package com.jwang.test;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jwang.common.utils.ReflectModel;

public class ReflectTest 
{
	private static final Logger LOG = Logger.getLogger(ReflectTest.class); 
	
	@Test
	public void testReflect()
	{
		ReflectModel<String> reflectModel = new ReflectModel<String>();
		
		reflectModel.setCondition("condition");
		reflectModel.setResult("result");
		reflectModel.setStatus("status");
		reflectModel.setList(new ArrayList<String>());
		
		LOG.info(reflectModel.getCondition());
		LOG.info(reflectModel.getResult());
		LOG.info(reflectModel.getStatus());
		LOG.info(reflectModel.getList());
	}

}
