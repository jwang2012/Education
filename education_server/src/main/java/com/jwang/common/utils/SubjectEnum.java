package com.jwang.common.utils;

/**
 * @author jwang
 *　课程类型枚举类
 *
 */
public enum SubjectEnum {
	
	MATh,CHINESE,PHYSICS,CHEMISTRY,ENGLISH;
	
	public String getValue()
	{
		switch(this)
		{
		case MATh:
			return "MATH";
		case CHINESE:
			return "CHINESE";
		case PHYSICS:
			return "PHYSICS";
		case CHEMISTRY:
			return "CHEMISTRY";
		case ENGLISH:
			return "ENGLISH";
		default:
			return "";
		}
	}
	
	public int getIntValue()
	{
		switch(this)
		{
		case MATh:
			return 1;
		case CHINESE:
			return 2;
		case PHYSICS:
			return 3;
		case CHEMISTRY:
			return 4;
		case ENGLISH:
			return 5;
		default:
			return 0;
		}
	}
}
