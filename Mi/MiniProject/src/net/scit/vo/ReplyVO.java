package net.scit.vo;

public class ReplyVO {
	private String r_num;
	private String b_num;
	private String r_content;
	private String usrid;
	
	public ReplyVO() {}
	
	public ReplyVO(String b_num, String r_content, String usrid) {
		this.b_num = b_num;
		this.r_content = r_content;
		this.usrid = usrid;
	}
	
	public void output() {
		System.out.println("덧글번호 :" +r_num + "작성자 : " + usrid);
		System.out.println("내용 : " + r_content);
	}

	public String getR_num() {
		return r_num;
	}

	public void setR_num(String r_num) {
		this.r_num = r_num;
	}

	public String getB_num() {
		return b_num;
	}

	public void setB_num(String b_num) {
		this.b_num = b_num;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	@Override
	public String toString() {
		return "덧글번호 = " + r_num + " , 글번호 = " + b_num  + ", 작성자 = " + usrid + " , 내용 : " + r_content;
	}
	
}
