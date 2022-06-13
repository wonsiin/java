package net.scit.cashbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.scit.cashbook.vo.CashItem;
import net.scit.cashbook.vo.Cashbook;
import net.scit.cashbook.vo.TotalAmount;

public class CashbookDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
		// CashItem 전체 조회
		public List<CashItem> selectCashItem() {
			// Code here
			SqlSession session = factory.openSession();
			CashbookMapper mapper = session.getMapper(CashbookMapper.class);
			List<CashItem> list = mapper.selectCashItem();
			return list;
		}
		
		// 지출 내역 입력
		public int insertCashbook(Cashbook book) {
			SqlSession session = factory.openSession();
			CashbookMapper mapper = session.getMapper(CashbookMapper.class);
			int result = mapper.insertCashbook(book);
			session.commit();
			return result;
		}
		
		// 년+월별 지출 내역 확인
		public List<Cashbook> ReadCashbookByDate(String date) {
			SqlSession session = factory.openSession();
			CashbookMapper mapper = session.getMapper(CashbookMapper.class);
			List<Cashbook> list = mapper.ReadCashbookByDate(date);
			return list;
		}
		
		// 내역 삭제
		public int deleteCashbook(int seq) {
			SqlSession session = factory.openSession();
			CashbookMapper mapper = session.getMapper(CashbookMapper.class);
			int result = mapper.deleteCashbook(seq);
			session.commit();
			return result;
		}
		
		// 지출 통계 조회
		public List<TotalAmount> statatics(String date) {
			SqlSession session = factory.openSession();
			CashbookMapper mapper = session.getMapper(CashbookMapper.class);
			List<TotalAmount> list = mapper.statatics(date);
			return list;
		}
	}
