package stream;

class ThreadA2 extends Thread{
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for(int i =0; i < 1000; ++i) {
			System.out.println("ThreadA 실행중 =>" + i);
			if(i % 10 == 0) System.out.println();
		}
		long end = System.currentTimeMillis();
		System.out.print("1쓰시간 : " + (end - start) + ", 끝나는시간 : " + end);
	}	
}
class ThreadB2 implements Runnable{
	@Override
	public void run() {
		int cnt = 0;
		long start = System.currentTimeMillis();
		for(char ch = 'A'; ch <= 'z'; ++ch) {
			System.out.print(ch + " ");
			if(ch % 10 == 0) System.out.println();
			if(cnt >= 10) break;
			if(ch == 'z') {
				ch = 'A'-1;
				cnt++;
				continue;
			}
		}
		long end = System.currentTimeMillis();
		System.out.print("2쓰시간 : " + (end - start) + ", 끝나는시간 : " + end);
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {
		ThreadA2 t1 = new ThreadA2();
		Thread t2 = new Thread(new ThreadB2());
		
		t1.start();
		t2.start();
		
//		t1.run();
//		t2.run();
	}

}
