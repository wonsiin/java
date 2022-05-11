import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("a.txt");

		int result = 0;
		while(true) {


			result = fis.read();	//글자 1개를 읽고 -- > 코드값으로 return 한다.
			if(result == -1) break;
			System.out.print((char)result);		//읽을 data가 없어서 -1이 출력
			Thread.sleep(500);
		}
		
		
		
	}

}
