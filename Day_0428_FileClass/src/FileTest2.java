import java.io.File;

// . : 현재 위치 나타내는 기호 (현재 디렉토리)
// .. : 현재 디렉토리의 상위 (상위 디렉토리)


public class FileTest2 {

	public static void main(String[] args) {
		File f1 = new File("..");				//현재 디렉토리를 저장시켜준다.
		
		String[] names = f1.list();				//String 배열로 되어있어 String 배열로 받을수 있다.
		
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
