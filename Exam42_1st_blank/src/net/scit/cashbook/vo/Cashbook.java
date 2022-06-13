package net.scit.cashbook.vo;

public class Cashbook {
	private int seq;
	private String dates;
	private String itemid;
	private String detail;
	private int amount;
	private String note;
	public Cashbook() {
		super();
	}
	public Cashbook(int seq, String dates, String itemid, String detail, int amount, String note) {
				//기입날짜
		this.itemid = itemid;				//지출 아이템 일련번호
		this.detail = detail;					//내용
		this.amount = amount;			//금액
		this.note = note;						//비고
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		String temp = String.format("%d / %s / %s / %,d / %s  ", seq, dates, detail, amount , note);
		return temp;
	}
}
