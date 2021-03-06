class BankAccount{
	private int balance = 100000000;
	
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int money) {	//synchronized 가 들어가면 동기화된 쓰레드라고 한다. 
													//polling,mutex,dead lock, synchronized,critical section
													//시인크로나이제드
													//mutex : 공유공간에 rack을 건다.
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}
class Account implements Runnable {
	BankAccount bank = new BankAccount();

	@Override
	public void run() {
		//반복적으로 돈을 인출
		while(bank.getBalance() > 0) {
			int money = (int) (Math.random() * 5 + 1) * 10000000;
			bank.withdraw(money);
			System.out.println("잔액 : " + bank.getBalance());
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		Runnable r = new Account();
		new Thread(r).start();
		new Thread(r).start();

	}

}
