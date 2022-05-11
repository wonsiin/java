package objectoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;

public class ObjectInputTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		
		@SuppressWarnings("unchecked")
		List<Student> list =(List<Student>)ois.readObject();
		
		Iterator<Student> iter =  list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
