package com.jwang.education.dao;

import org.apache.ibatis.annotations.Param;

import com.jwang.education.model.StudentInfoModel;

public interface StudentInfoDao {

	StudentInfoModel queryStudentInfoById(@Param("id") int id);
}
