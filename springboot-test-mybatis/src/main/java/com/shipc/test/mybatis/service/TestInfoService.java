package com.shipc.test.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ShiPC
 * 2018年9月5日
 * 
 */
@Service
public class TestInfoService {
	
	@Autowired
	@Qualifier("impalaSqlSessionFactory")
	private SqlSessionFactory impalaSqlSessionFactory;
	
	public List<Object> getData() {
		SqlSession session = this.impalaSqlSessionFactory.openSession(ExecutorType.SIMPLE, false);
		List<Object> selectList;
		try {
			selectList = session.selectList("TestInfoMapper.selectTestInfo"); //这里对应mapper.xml中的 "namespace.id"
		} finally {
			session.close();
		}
		
		for(Object object: selectList) {
			System.out.println(object);
		}
		return selectList;
	}
}
