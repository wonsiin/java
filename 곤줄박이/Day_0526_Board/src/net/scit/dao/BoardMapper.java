package net.scit.dao;

import java.util.List;
import java.util.Map;

import net.scit.vo.Board;

public interface BoardMapper {
	// 게시글 전체 출력
	public List<Board> listBoard();

	// 게시글 등록
	public int writeBoard(Board board);

	// 게시글 조회
	public Board readBoard(String boardnum);

	// 게시글 검색
	public List<Board> searchBoard(Map<String, Object> map);

	// 게시글 삭제
	public int deleteBoard(String boardnum);

	// 게시글 수정
	public int updateBoard(Board board);

	// 조회수 수정
	public int incrementHitcount(String boardnum);

	// 전체 글 수
	public int getCount();
}
