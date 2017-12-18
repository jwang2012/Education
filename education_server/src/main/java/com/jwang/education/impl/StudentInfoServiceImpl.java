package com.jwang.education.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwang.education.dao.StudentInfoDao;
import com.jwang.education.model.StudentInfoModel;
import com.jwang.education.service.StudentInfoService;
@Service
public class StudentInfoServiceImpl implements StudentInfoService{

	@Autowired
	private StudentInfoDao studentInfoDao;
	
	@Override
	public StudentInfoModel queryStudentInfoById(int id) {
		
		StudentInfoModel studentInfo = studentInfoDao.queryStudentInfoById(id);
		
		return studentInfo;
	}

}
