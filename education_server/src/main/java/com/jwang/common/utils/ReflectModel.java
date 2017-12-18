package com.jwang.common.utils;

import java.util.List;

/**
 * @author jwang
 * �����࣬��Ϊ��ͬ���ģ��
 * @param <T>
 */
public class ReflectModel<T>
{
	private T result;
	
	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public T getCondition() {
		return condition;
	}

	public void setCondition(T condition) {
		this.condition = condition;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	private T condition;
	
	private String status;
	
	private List<T> list;

}
