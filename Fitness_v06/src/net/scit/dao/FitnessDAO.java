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
		int result = mapper.regist(vo); //받은 데이터를 데이터 베이스로 옴긴다. i / d /u 는 commit이 들어가야함
		session.commit();
		
		
		return result;
	}

//return list형테로 
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
		
		FitnessVO vo = mapper.findById(usrid);//데이터를 가져올수 있는지 확인  (vo안에서)
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
		int result = mapper.update(vo); //받은 데이터를 데이터 베이스로 옴긴다. i / d /u 는 commit이 들어가야함
		session.commit();
		
		
		return result;
	}

	public void getCount() {
		SqlSession session = null;
		session = factory.openSession();
		
		FitnessMapper mapper = session.getMapper(FitnessMapper.class);
		 mapper.getCount();
		 if(mapper.getCount() == 0) {
			 System.out.print("아무도 존재하지 않습니다.");
			 System.out.println();
			 return;
		 }
		System.out.println("현재 인원은 " + mapper.getCount()+ " 명 입니다. ");
	}
	
}
