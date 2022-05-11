import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest6 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("test.txt");
		
		int result = 0;
		
		while(true) {
			result = fis.read();
			if(result == -1) break;
			Thread.sleep(1000); // InterruptedException 필수요소
			System.out.println(result);
		}
		
		System.out.println("\nEnd !");
		fis.close();
	}

}
