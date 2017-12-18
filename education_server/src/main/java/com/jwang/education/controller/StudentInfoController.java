package com.jwang.education.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.jwang.common.constant.ResultMsgCode;
import com.jwang.education.model.StudentInfoModel;
import com.jwang.education.service.StudentInfoService;      

@Controller
@RequestMapping(value="/student")
public class StudentInfoController extends BaseController{

	public static final Gson gson = new Gson();
	@Autowired 
	private StudentInfoService studentInfoService;
	
	@RequestMapping(value="/queryStudentInfoById",method=RequestMethod.GET)
	public void queryStudentInfoById(@RequestParam int id, HttpServletResponse response) throws IOException
	{
		StudentInfoModel studentInfo = studentInfoService.queryStudentInfoById(id);
		
		returnToPage(response, gson.toJson(bulidResultObj(ResultMsgCode.SUCCESS, null, studentInfo)), "00000");
	}
}
