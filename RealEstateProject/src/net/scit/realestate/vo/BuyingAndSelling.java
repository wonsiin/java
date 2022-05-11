package net.scit.realestate.vo;

public class BuyingAndSelling extends RealEstate{
	private int price;
	
	public BuyingAndSelling(){}
	public BuyingAndSelling(int price) {
		this.price = price;
	}
	
	public BuyingAndSelling(String address, String houseType, int size,int price) {
		super(address, houseType, size);
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}

	@Override
	public String getInfo() {
		return super.getInfo();
	}
	@Override
	public String toString() {
		return "price = " + price;
	}
}
