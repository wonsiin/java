package net.scit.service;

import java.util.List;

import net.scit.vo.FitnessVO;

public interface FitnessService {
	//등록
	public int regist(FitnessVO vo);
	
	//아이디로 조회
	public FitnessVO findById(String userid);
	
	//전체 데이터 조회 --> UI족에서 출력할때 이름순으로 출력
	//forEach()로 출력할것
	public List<FitnessVO> findAll();
	
	//삭제 --> removeIF를 써서 람다식으로
	public int delete(String userid);
	
	//수정
	public int update(FitnessVO vo);
	
	//파일에 접근(setFile : 종료시 마지막에! , getFile:구동시 처음에!)
	public void setFile();
}
