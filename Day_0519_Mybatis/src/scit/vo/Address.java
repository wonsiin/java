package scit.vo;

public class Address {
	private String usrid;
	private String phone;
	private String address;
	
	public Address() {
	}

	public Address(String usrid, String phone, String address) {
		super();
		this.usrid = usrid;
		this.phone = phone;
		this.address = address;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [usrid=" + usrid + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

	
	
	
	
	
}

