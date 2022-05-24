package net.scit.dao; //1 data mapper

import java.util.List;

import net.scit.vo.FitnessVO;

public interface FitnessMapper { //2 data mapper
	//회원가입(c)
	public int regist(FitnessVO vo);
	
	//아이디로 조회(r)
	public FitnessVO findById(String userid);
	
	//전체 데이터 조회(r)
	public List<FitnessVO> findAll();
	
	//삭제 (d)
	public int delete(String userid);
	
	//수정(u)
	public int update(FitnessVO vo);
	
}
