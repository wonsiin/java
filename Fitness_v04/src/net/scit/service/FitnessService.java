package net.scit.service;

import java.util.List;

import net.scit.vo.FitnessVO;

public interface FitnessService {
	//���
	public int regist(FitnessVO vo);
	
	//���̵�� ��ȸ
	public FitnessVO findById(String userid);
	
	//��ü ������ ��ȸ
	public List<FitnessVO> findAll();
	
	//����
	public int delete(String userid);
	
	//����
	public int update(FitnessVO vo);
	
	//���Ͽ� ����(setFile : ����� ��������! , getFile:������ ó����!)
	public void setFile();
}
