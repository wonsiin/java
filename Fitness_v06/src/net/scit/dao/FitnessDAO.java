package net.scit.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.vo.FitnessVO;

public class FitnessDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public int regist(FitnessVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		int result = mapper.regist(vo);
		session.commit();
		
		
		return result;
	}

//return list���׷� 
	public List<FitnessVO> findAll() {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		List<FitnessVO> list = mapper.findAll();
		return list;
	}

	public FitnessVO findById(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		
		FitnessVO vo = mapper.findById(usrid);//�����͸� �����ü� �ִ��� Ȯ��  (vo�ȿ���)
		return vo;
	}

	public int delete(String userid) {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		int result = mapper.delete(userid);
		if(result == 1) {
			session.commit();
			return 1;
		}
		return 0;
		
		
		
	}

	public int update(FitnessVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		int result = mapper.update(vo); //���� �����͸� ������ ���̽��� �ȱ��. i / d /u �� commit�� ������
		session.commit();
		
		
		return result;
	}

	public void getCount() {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		 mapper.getCount();
		 if(mapper.getCount() == 0) {
			 System.out.print("�ƹ��� �������� �ʽ��ϴ�.");
			 System.out.println();
			 return;
		 }
		System.out.println("���� �ο��� " + mapper.getCount()+ " �� �Դϴ�. ");
	}
	
}
