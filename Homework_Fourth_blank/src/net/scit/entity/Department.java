package net.scit.entity;

public enum Department {
	MI("�ܰ�"), NI("����"), SI("�Ǻΰ�"), TI("�Ҿư�"), VI("����ΰ�"), WI("�񴢱��");
	
	// Code Here
	private String bu;
	private Department(String bu) {
		this.bu = bu;
	}
	public String getBu() {
		return bu;
	}
}
