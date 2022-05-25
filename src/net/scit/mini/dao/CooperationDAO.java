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
		int result = mapper.regist(vo); //받은 데이터를 데이터 베이스로 옴긴다. i / d /u 는 commit이 들어가야함
		session.commit();
		
		
		return result;
	}

//return list형테로 
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
		
		CooperationVO vo = mapper.findById(usrid);//데이터를 가져올수 있는지 확인  (vo안에서)
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
		int result = mapper.update(vo); //받은 데이터를 데이터 베이스로 옴긴다. i / d /u 는 commit이 들어가야함
		session.commit();
		
		
		return result;
	}

	public void getCount() {
		SqlSession session = null;
		session = factory.openSession();
		
		CooperationMapper mapper = session.getMapper(CooperationMapper.class);
		 mapper.getCount();
		 if(mapper.getCount() == 0) {
			 System.out.print("아무도 존재하지 않습니다.");
			 System.out.println();
			 return;
		 }
		System.out.println("현재 인원은 " + mapper.getCount()+ " 명 입니다. ");
	}
	
}
