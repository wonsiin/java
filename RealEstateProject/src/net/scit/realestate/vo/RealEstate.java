package net.scit.realestate.vo;

public class RealEstate {
	private String address;
	private String houseType;
	private int size;
	
	public RealEstate() {}
	public RealEstate(String address, String houseType, int size) {
		this.address = address;
		this.houseType = houseType;
		this.size = size;
	}

	//info
	public String getInfo() {
		return null;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "RealEstate [address=" + address + ", houseType=" + houseType + ", size=" + size + "]";
	}
	
	
	
	
}
