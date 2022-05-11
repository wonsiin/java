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
		
		list.add(new Student("�ֱ׷���", 51));
		list.add(new Student("�����ü�", 25));
		list.add(new Student("���۵��߼�", 16));
		list.add(new Student("���������Ҽ�", 37));
		
		oos.writeObject(list);
		
		
//		Student std = new Student("¥����̽ȴٰ��ϼ˾�",50);
//		oos.writeObject(std);
		
		System.out.println("�Ϸ�!!");
		
		oos.close();
	}

}
