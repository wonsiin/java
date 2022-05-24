package scit.vo;

public class User {
	private String usrid;
	private String usrname;
	private String phone;
	private String address;
	
	public User() {}
	public User(String usrid, String usrname, String phone, String address) {
		this.usrid = usrid;
		this.usrname = usrname;
		this.phone = phone;
		this.address = address;
	}
	public String getUsrid() {
		return usrid;
	}
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
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
		return "User [usrid=" + usrid + ", usrname=" + usrname + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	
	
}
