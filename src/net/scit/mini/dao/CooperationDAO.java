package net.scit.mini.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import net.scit.mini.vo.CooperationVO;

public class CooperationDAO {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public int regist(CooperationVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		int result = mapper.regist(vo); //���� �����͸� ������ ���̽��� �ȱ��. i / d /u �� commit�� ������
		session.commit();
		
		
		return result;
	}

//return list���׷� 
	public List<CooperationVO> findAll() {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		List<CooperationVO> list = mapper.findAll();
		return list;
	}

	public CooperationVO findById(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		
		CooperationVO vo = mapper.findById(usrid);//�����͸� �����ü� �ִ��� Ȯ��  (vo�ȿ���)
		return vo;
	}

	public int delete(String userid) {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		int result = mapper.delete(userid);
		if(result == 1) {
			session.commit();
			return 1;
		}
		return 0;
		
		
		
	}

	public int update(CooperationVO vo) {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		int result = mapper.update(vo); //���� �����͸� ������ ���̽��� �ȱ��. i / d /u �� commit�� ������
		session.commit();
		
		
		return result;
	}

	public void getCount() {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		 mapper.getCount();
		 if(mapper.getCount() == 0) {
			 System.out.print("�ƹ��� �������� �ʽ��ϴ�.");
			 System.out.println();
			 return;
		 }
		System.out.println("���� �ο��� " + mapper.getCount()+ " �� �Դϴ�. ");
	}
	
}
