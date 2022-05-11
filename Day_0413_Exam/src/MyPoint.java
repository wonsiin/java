
public abstract class MyPoint {
	private int x;
	private int y;
	public MyPoint() {
		super();
	}
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public abstract void output();
	public abstract void calc();
	
}
/*
[문제] 
MyPoint 추상 클래스 정의 
   멤버변수 : x, y 
   추상 메소드 : output(출력하는 메소드), calc(면적을 구하는 메소드)
   생성자 2개

MyCircle 클래스 정의 - MyPoint 상속함
   멤버변수 : radius, area
   구현메소드 : output, calc
   생성자 2개

MyTriangle 클래스 정의 - MyPoint 상속함
   멤버변수 : width, height, area
   구현메소드 : output, calc
   생성자 2개

위 3개의 객체를 50개 담을 수 있는 객체배열 생성

<실행>
1) 원 2) 삼각형  3) 전체출력 4) 종료 : (선택) 1
x:1
y:1
r:5
입력완료

1) 원 2) 삼각형  3) 전체출력 4) 종료 : (선택) 2
x:1
y:1
w:5
h:4
입력완료

1) 원 2) 삼각형  3) 전체출력 4) 종료 : (선택) 3
x=1, y=1, r=5, area=___
x=1, y=1, w=5, h=4, area=___

1) 원 2) 삼각형  3) 전체출력 4) 종료 : (선택) __

toString() {
		return "x=" + x + ", y=" + y;
	}
*/