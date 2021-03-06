package stream;

class ThreadA1 extends Thread{//is -a 도 Thread가 된다.

	@Override
	public void run() {
		for(int i =0; i < 200; ++i) {
			System.out.println("ThreadA 실행중 =>" + i);
			if(i % 10 == 0) System.out.println();
		}
	}	
}

class ThreadB1 implements Runnable{
	@Override
	public void run() {
		int cnt = 0;
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
	}
	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		ThreadA1 th1 = new ThreadA1();					//Thread Class 시 (상속시)
		Thread th2 = new Thread(new ThreadB1());		//Thread implements 시(구현시)

		
		System.out.println(Thread.MAX_PRIORITY);//우선순위 높은걸 보여주는것
		System.out.println(Thread.MIN_PRIORITY);//우선순위 높은걸 보여주는것
		
		System.out.println(th1.getPriority());		//중간값
		System.out.println(th2.getPriority());		//중간값
		th1.setPriority(10);
		th2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		th1.start();
		th2.start();
//		th1.run();				Thread 처리가 안됨 메소드 처리가됨
//		th2.run();
		
		
	}

}
