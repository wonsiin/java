

public class ExceptionTest3 {

	public static void main(String[] args) throws InterruptedException{
		int i = 0;
		while(true) {
			++i;
			System.out.println(i);
			Thread.sleep(1000);
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) { //무리하게 강제로 진행하게 하는게 Interrupted다 (좋은건 아니다)
//				e.printStackTrace();
//			}
			
		}
		
	}
}
