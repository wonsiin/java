import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest6 {

	public static void main(String[] args) throws IOException, InterruptedException { //데이터 복사할때 이렇게 사용가능
		FileInputStream fis = new FileInputStream("roje.jpeg"); //파일 가져오기
		FileOutputStream fos = new FileOutputStream("pupu2.jpeg"); //새로 만들이름
		
		int result = 0;
		int cnt = 0;
		byte[] by = new byte[1000];
		
		while(true) {
			result = fis.read(by);
			System.out.println(result);
			if(result < by.length) break;
			Thread.sleep(1000);
			fos.write(by);
			cnt++;
		}
		//마지막 데이터는 저장 못한 상태임
		fos.write(by, 0, result); // by의 공간을 어디서 부터 어디까지 저장할건지 정한다.
		
		System.out.println("\n완료 ==>" + cnt);
//		
//		
//		
		if(fis != null) fis.close();
		if(fos != null) fis.close();

	}

	}

