

public class ExceptionTest3 {

	public static void main(String[] args) throws InterruptedException{
		int i = 0;
		while(true) {
			++i;
			System.out.println(i);
			Thread.sleep(1000);
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) { //�����ϰ� ������ �����ϰ� �ϴ°� Interrupted�� (������ �ƴϴ�)
//				e.printStackTrace();
//			}
			
		}
		
	}
}
