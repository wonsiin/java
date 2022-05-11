
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
[����] 
MyPoint �߻� Ŭ���� ���� 
   ������� : x, y 
   �߻� �޼ҵ� : output(����ϴ� �޼ҵ�), calc(������ ���ϴ� �޼ҵ�)
   ������ 2��

MyCircle Ŭ���� ���� - MyPoint �����
   ������� : radius, area
   �����޼ҵ� : output, calc
   ������ 2��

MyTriangle Ŭ���� ���� - MyPoint �����
   ������� : width, height, area
   �����޼ҵ� : output, calc
   ������ 2��

�� 3���� ��ü�� 50�� ���� �� �ִ� ��ü�迭 ����

<����>
1) �� 2) �ﰢ��  3) ��ü��� 4) ���� : (����) 1
x:1
y:1
r:5
�Է¿Ϸ�

1) �� 2) �ﰢ��  3) ��ü��� 4) ���� : (����) 2
x:1
y:1
w:5
h:4
�Է¿Ϸ�

1) �� 2) �ﰢ��  3) ��ü��� 4) ���� : (����) 3
x=1, y=1, r=5, area=___
x=1, y=1, w=5, h=4, area=___

1) �� 2) �ﰢ��  3) ��ü��� 4) ���� : (����) __

toString() {
		return "x=" + x + ", y=" + y;
	}
*/