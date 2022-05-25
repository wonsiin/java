package net.scit.mini.dao; //1 data mapper

import java.util.List;

import net.scit.mini.vo.CooperationVO;



public interface CooperationMapper { //2 data mapper
	//회원가입(c)
	public int regist(CooperationVO vo);
	
	//아이디로 조회(r)
	public CooperationVO findById(String userid);
	
	//전체 데이터 조회(r) 정수가 나오기도함
	public List<CooperationVO> findAll();
	
	//삭제 (d)
	public int delete(String userid);
	
	//수정(u)
	public int update(CooperationVO vo);
	
	//인원수 조회 select count(*)from fitness
	public int getCount();
	
}
