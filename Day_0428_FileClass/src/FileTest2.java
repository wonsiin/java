import java.io.File;

// . : ���� ��ġ ��Ÿ���� ��ȣ (���� ���丮)
// .. : ���� ���丮�� ���� (���� ���丮)


public class FileTest2 {

	public static void main(String[] args) {
		File f1 = new File("..");				//���� ���丮�� ��������ش�.
		
		String[] names = f1.list();				//String �迭�� �Ǿ��־� String �迭�� ������ �ִ�.
		
		for(String n : names)
			System.out.println(n);
		f1.listFiles();
		
		for(String n : names)
			System.out.println(n);
		System.out.println();
		File[] f = f1.listFiles();
		
		for(File ftmp : f)
			System.out.println(ftmp.getName());
		

	}

}
