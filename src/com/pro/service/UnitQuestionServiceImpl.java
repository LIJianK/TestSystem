package com.pro.service;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;


import com.pro.dao.UnitQuestionDao;
import com.pro.dao.UnitQuestionDaoImpl;
import com.pro.domain.Question;
import com.pro.domain.UnitQuestion;
import com.pro.util.DbHelper;

public class UnitQuestionServiceImpl implements UnitQuestionService {

	@Override
	public void insertUnitQuestion(UnitQuestion unitQuestion) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			UnitQuestionDao unitQuestionDao = new UnitQuestionDaoImpl();
			unitQuestionDao.insertUnitQue(conn, unitQuestion);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	@Override
	public List<Question> selectUnitQuestion(String unitId) {
		Connection conn = null;
		List<Question> questionList = new ArrayList<Question>();
		try {
			conn = DbHelper.getConn();
			UnitQuestionDao unitQuestionDao = new UnitQuestionDaoImpl();
			questionList = unitQuestionDao.findUnitQuestion(conn, unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return questionList;
	}


	@Override
	public List<Question> getAllUnitQuestion(String unitId) {
		Connection conn = null;
		List<Question> questionList = null;
		try {
			conn = DbHelper.getConn();
			UnitQuestionDao unitQuestionDao = new UnitQuestionDaoImpl();
			questionList = unitQuestionDao.getAllUnitQuestion(conn, unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return questionList;
	}


}
