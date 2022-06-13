package net.scit.cashbook.vo;

public class CashItem {
	private int itemid;
	private String itemname;
	
	public CashItem() {
		super();
	}

	public CashItem(int itemid, String itemname) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	@Override
	public String toString() {
		return itemid + " ("  + itemname +")";
	}
}
