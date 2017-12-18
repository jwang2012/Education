package com.jwang.test;
 
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.jwang.common.utils.PropertiesUtil;

/**
 * @author jwang
 * 简单的properties文件读写测试类
 *
 */
public class PropertiesTest 
{
	private static final Logger LOG = Logger.getLogger(PropertiesTest.class);
	
	private static final String PROPETIES_PATH = "conf/application.properties";
	
	private static final Properties PROP = PropertiesUtil.getProperties(PROPETIES_PATH);
	
	private static final String UPLOAD_PDF_PATH = "/home/jwang/pdf";
	
	@Test
	public void testGetProperties()
	{
		
		String userName = PROP.getProperty("db.username");
		
		String passWord = PROP.getProperty("db.password");
		
		LOG.info("userName:"+userName);
		
		LOG.info("passWord:"+passWord);
		
		PropertiesUtil.setValue(PROPETIES_PATH, "file.upload.pdf", UPLOAD_PDF_PATH);
	}
}
