package com.pro.dao;

import java.sql.Connection;
import java.util.List;

import com.pro.domain.Question;
import com.pro.domain.UnitQuestion;

public interface UnitQuestionDao {
	
	public void insertUnitQue(Connection conn,UnitQuestion unitQuestion)throws Exception;
	
	public List<Question> findUnitQuestion(Connection conn,String unitId)throws Exception;
	
	public List<Question> getAllUnitQuestion(Connection conn,String unitId)throws Exception;
}
