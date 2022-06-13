package net.scit.dao;

import java.util.List;
import java.util.Map;

import net.scit.vo.Board;
import net.scit.vo.Reply;

public interface BoardMapper {
	//게시글 전체 출력
	public List<Board> listBoard();
	
	//게시글 등록
	public int weiterBoard(Board board); //
	//게시글 조회
	public Board readBoard(int boardunm); //
	//게시글 검색
	public List<Board>  searchBoard(Map<String, Object> map);
	//게시글 삭제
	public int deletBoard(String b_num); //
	//게시글 수정
	public int updateBoard(Board board);
	//조회수 수정
	public int incrementHitcount(int boardaunm); //
	//전체 글 개수
	public int getCount();

	public Board findById(int boardnum);

	
	
}

