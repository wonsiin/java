package net.scit.mini.dao; //1 data mapper

import java.util.List;

import net.scit.mini.vo.CooperationVO;



public interface CooperationMapper { //2 data mapper
	//ȸ������(c)
	public int regist(CooperationVO vo);
	
	//���̵�� ��ȸ(r)
	public CooperationVO findById(String userid);
	
	//��ü ������ ��ȸ(r) ������ �����⵵��
	public List<CooperationVO> findAll();
	
	//���� (d)
	public int delete(String userid);
	
	//����(u)
	public int update(CooperationVO vo);
	
	//�ο��� ��ȸ select count(*)from fitness
	public int getCount();
	
}
