import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("anysong.txt");
		FileOutputStream fos = new FileOutputStream("temp.txt");
		
		int result = 0;
		
		while(true) {
			result = fis.read();
			if(result == -1) break;
			
			System.out.print((char)result);
			fos.write(result);
		}
		System.out.println("\n¿Ï·á");
		
		
		
		if(fis != null) fis.close();
		if(fos != null) fis.close();

	}

}
