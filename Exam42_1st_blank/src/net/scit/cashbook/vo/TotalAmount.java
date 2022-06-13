package net.scit.cashbook.vo;

public class TotalAmount {
	private String itemname;
	private int total;
	
	public TotalAmount() {
		super();
	}

	public TotalAmount(String itemname, int total) {
		super();
		this.itemname = itemname;
		this.total = total;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		String temp = String.format("%s\t %,d원", itemname, total);
		return temp;
	}
}
