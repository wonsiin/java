package enumtest;

public enum Weather {
	����("Sunny"),�帲("Cloudy"),��("Snowing"),��("Rainy"),�Ȱ�("Fog");
	
	private String temp;
	private Weather(String temp) {
		this.temp = temp;
	}
	public String getTemp() {
		return temp;
	}
	
}
