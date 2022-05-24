package net.scit.dao; //1 data mapper

import java.util.List;

import net.scit.vo.FitnessVO;

public interface FitnessMapper { //2 data mapper
	//ȸ������(c)
	public int regist(FitnessVO vo);
	
	//���̵�� ��ȸ(r)
	public FitnessVO findById(String userid);
	
	//��ü ������ ��ȸ(r)
	public List<FitnessVO> findAll();
	
	//���� (d)
	public int delete(String userid);
	
	//����(u)
	public int update(FitnessVO vo);
	
}
