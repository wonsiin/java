package net.scit.realestate.vo;

public class Charter extends RealEstate{
	private int depositMoney;
	
	public Charter() {}
	public Charter(String adString, String hoString, int size, int depositMoney) {
		super(adString,hoString,size);
		this.depositMoney = depositMoney;
	}
	public int getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}

	@Override
	public String toString() {
		return super.toString() + "Charter [depositMoney=" + depositMoney + "]";
	}
	
}
