class Shared{
	private double result; //���� �ٸ� �����忡�� �����ϴ� �޸� ����
	private boolean ready; //true�̸� result�� ����� �ԷµǾ���!
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public boolean getReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
}
//������

class CalcThread extends Thread{
	private Shared shared;		//new ����ؼ� ���� �ڷᰡ �ʿ��ϴϱ� shared�� ��Ƽ� result�� �����Ϸ���
	
	CalcThread(Shared shared) {
		this.shared = shared;
	}
	@Override
	public void run() {	
		double total = 0.0;
		shared.setReady(false);
		//������ ���ϴ� ����
		for(int i = 1; i < 1000000000; i+=2) {
			if(i / 2 % 2 == 0) 
				total += 1.0 /i;
			else
				total -= 1.0 /i;
		}
		
		shared.setResult(total*4);
		shared.setReady(true);
		System.out.println("�������� ��� : " + shared.getResult());
	}
	
}
//�Һ���
class Consumer extends Thread{
	private Shared shared;
	public Consumer(Shared shared) {
		this.shared = shared;
	}
	@Override
	public void run() {
		//polling ���
		while(true) {
			System.out.println("");
			if(shared.getReady()) break;
		}
		System.out.println("�Һ����� ��� : " + shared.getResult());
	}
}


public class ThreadTest1 {

	public static void main(String[] args) {
		Shared obj = new Shared();
		CalcThread t1 = new CalcThread(obj);
		Consumer t2 = new Consumer(obj);
		t1.start();
		t2.start();

	}

}
