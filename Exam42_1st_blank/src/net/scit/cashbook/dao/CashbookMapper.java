package net.scit.cashbook.dao;

import java.util.List;
import java.util.Map;

import net.scit.cashbook.vo.Cashbook;
import net.scit.cashbook.vo.TotalAmount;
import net.scit.cashbook.vo.CashItem;

/**
 * Mapper XML의 SQL문 사용 메서드
 */
public interface CashbookMapper {
	// CashItem 전체 조회
	public List<CashItem> selectCashItem();
	
	// 지출 내역 입력
	public int insertCashbook(Cashbook book);
	
	// 년+월별 지출 내역 확인
	public List<Cashbook> ReadCashbookByDate(String date);
	
	// 내역 삭제
	public int deleteCashbook(int seq);
	
	// 지출 통계 조회
	public List<TotalAmount> statatics(String date);

	//달력값받기
	public String sys(String dates);

	
}