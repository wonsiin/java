package scit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import scit.vo.User;
import scit.vo.UserVO;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); //�������� �۾�
	
	public int insertUser(UserVO vo) {
		SqlSession session = null;
		session = factory.openSession();	//���ǰ� �����°� session�� ����
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper�� ����
		
		int result = mapper.insertUser(vo);	//������ �ҷ���
		session.commit();
		return result;
	}
	
	public int insertUser(User user) {
		SqlSession session = null;
		session = factory.openSession();	//���ǰ� �����°� session�� ����
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper�� ����
		//usr ���̺� �����ڵ�
		int result = 0;
		if(user.getPhone() == null || user.getAddress() ==null) {
			result = mapper.insertUser(new UserVO(user.getUsrid(), user.getUsrname())); //1���� ����
		}else {
			//usraddr ���̺� ���� �ڵ�
			result = mapper.insertUser(new UserVO(user.getUsrid(), user.getUsrname())); //2���� ����
			result = mapper.insert(user);
		}
		//������ �ҷ���
		
	
		session.commit();
		return result;
	}
	
	public List<UserVO> selectUser() {
		SqlSession session = null;
		session = factory.openSession(); //���ǰ� �����°� session�� ����
		
		UserMapper mapper = session.getMapper(UserMapper.class);		//UserMapper�� ����
		
		List<UserVO> list = mapper.selectUser();			//������ �ҷ���
		session.commit();
		return list;
	}

	public UserVO findById(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserVO vo = mapper.findById(usrid);	//������ �ҷ���
		return vo;
	}

	public List<User> selectAll() {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectAll();	
		return list;
	}

	public int Update(User user) {
		SqlSession session = null;
		session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
			//������ �������.
			int ret1 = mapper.updateUser(user);
			int ret2 = mapper.updateAddress(user);
			
			if(ret1 == 1 && ret2 == 1) {
				session.commit();
				return 1;
			}
			session.rollback();
			return 0;
	}

	public int delete(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		int result = mapper.delete(usrid);
		if(result == 1) { //���������� ������ commit�ϰ�
			session.commit();
			return 1;
		}
		return 0;
	}

}
