import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) throws IOException{
		byte[] by = {97,98,100,105,32,123};
		
		FileOutputStream fos = new FileOutputStream("a.txt", true); //true를 넣으면 data를 추가한다. 데이터를 날리지 마라 라는 신호
		fos.write(by);
		
		if(fos != null) fos.close();
		System.out.println("끝");
		
	}

}
