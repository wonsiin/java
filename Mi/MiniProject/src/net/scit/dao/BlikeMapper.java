package net.scit.dao;

import java.util.List;
import java.util.Map;

import net.scit.vo.BlikeVO;
import net.scit.vo.BoardVO;
import net.scit.vo.UserVO;

public interface BlikeMapper {

	int Up(BlikeVO vo);

	int De(BlikeVO vo);

	int getCount(String b_num);

	String listBlike(String b_num);

	
	
	BlikeVO ifLike(Map<String, String> map);
	
	int deleteLike(Map<String, String> map);

	Integer likeCount(String b_num);
	
}

