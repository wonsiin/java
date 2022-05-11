package objectoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("¿Ö±×·¨¼¶", 51));
		list.add(new Student("ºñÄí¸®½Ã¼¶", 25));
		list.add(new Student("¿ÀÀÛµ¿Çß¼¶", 16));
		list.add(new Student("ÅÁ¼öÀ°ÁÁ¾Ò¼¶", 37));
		
		oos.writeObject(list);
		
		
//		Student std = new Student("Â¥Àå¸éÀÌ½È´Ù°íÇÏ¼Ë¾î",50);
//		oos.writeObject(std);
		
		System.out.println("¿Ï·á!!");
		
		oos.close();
	}

}
