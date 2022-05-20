package scit.vo;

public class UserVO {
	private String usrid; //이름이 같아야한다
	private String	usrname;
	
	public UserVO() {}
	
	public UserVO(String usrid, String usrname) {
		this.usrid = usrid;
		this.usrname = usrname;
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
	@Override
	public String toString() {
		return "usrid=" + usrid + ", usrname=" + usrname;
	}
	
	
}

