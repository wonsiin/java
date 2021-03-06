class Shared{
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

class CalcThread extends Thread{
	private Shared shared;		//new 계산해서 넣을 자료가 필요하니까 shared에 담아서 result로 전달하려함
	
	CalcThread(Shared shared) {
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
		System.out.println("공급자의 결과 : " + shared.getResult());
	}
	
}
//소비자
class Consumer extends Thread{
	private Shared shared;
	public Consumer(Shared shared) {
		this.shared = shared;
	}
	@Override
	public void run() {
		//polling 방식
		while(true) {
			System.out.println("");
			if(shared.getReady()) break;
		}
		System.out.println("소비자의 결과 : " + shared.getResult());
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
