class MyShared{
	private double result; //서로 다른 스레드에서 공유하는 메모리 공간
	private boolean ready; //true이면 result에 결과가 입력되었다!
	
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
//공급자

class MyCalcThread extends Thread{
	private MyShared shared;		//new 계산해서 넣을 자료가 필요하니까 shared에 담아서 result로 전달하려함
	
	MyCalcThread(MyShared shared) {
		this.shared = shared;
	}
	@Override
	public void run() {	
		double total = 0.0;
		shared.setReady(false);
		//원주율 구하는 공식
		for(int i = 1; i < 1000000000; i+=2) {
			if(i / 2 % 2 == 0) 
				total += 1.0 /i;
			else
				total -= 1.0 /i;
		}
		
		shared.setResult(total*4);
		shared.setReady(true);
		
		synchronized (shared) {	//같이 써줘야한다. 기다리게 하는방법 및 알려주는 방법
			shared.notify();
		}
		System.out.println("공급자의 결과 : " + shared.getResult());
	}
	
}
//소비자
class MyConsumer extends Thread{
	private MyShared shared;
	public MyConsumer(MyShared shared) {
		this.shared = shared;
	}
	@Override
	public void run() {
		if(!shared.getReady())
			try {
				synchronized (shared) {//뮤텍스방식 클레스 내의 전체 메소드를 동기화시킬수도 있다.
					shared.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

		System.out.println("소비자의 결과 : " + shared.getResult());
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		MyShared obj = new MyShared();
		MyCalcThread t1 = new MyCalcThread(obj);
		MyConsumer t2 = new MyConsumer(obj);
		t1.start();
		t2.start();

	}

}
