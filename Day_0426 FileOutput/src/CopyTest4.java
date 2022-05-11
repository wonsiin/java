import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest4 {

	public static void main(String[] args) throws IOException { //데이터 복사할때 이렇게 사용가능
		FileInputStream fis = new FileInputStream("roje.jpeg"); //파일 가져오기
		FileOutputStream fos = new FileOutputStream("pupu.jpeg"); //새로 만들이름
		
		int result = 0;
		
		while(true) {
			result = fis.read();
			if(result == -1) break;
			
			fos.write(result);
		}
		System.out.println("\n완료");
		
		
		
		if(fis != null) fis.close();
		if(fos != null) fis.close();

	}

	}

