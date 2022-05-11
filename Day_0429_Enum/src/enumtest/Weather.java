package enumtest;

public enum Weather {
	¸¼À½("Sunny"),Èå¸²("Cloudy"),´«("Snowing"),ºñ("Rainy"),¾È°³("Fog");
	
	private String temp;
	private Weather(String temp) {
		this.temp = temp;
	}
	public String getTemp() {
		return temp;
	}
	
}
