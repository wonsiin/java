import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		//File Class : ��Ʈ���� �ƴϴ�.�ϵ��ũ���� �������� �����̳� ��θ� ��Ÿ���� �߻����� ����
		//File ��ü�� �����Ѵٰ� �ؼ� ������ �����Ǵ� ���� �ƴϴ�.
		// ������ : C:\workspace\Test_Java\Day_0428	: ��������
		// ���ͳ� : https://n.news.naver.com/article/081/0003269191?cds=news_media_pc&type=editn : �����ð� ��δ�.
		//														 ?cds=news_media_pc&type=editn : ������ ����� ����.
		// ������ , ���н� : / �� ǥ�� ��) : /workspace/Test_Java/Day_0428
		File f1 = new File("test.java");
		File f2 = new File("C:/workspace"); // \n \t �� �ν��ϱ⶧���� 2���� ���
												//C����̺� ���� �����ϸ� ������, ���� �������� �۾��ϴ°� �����
		System.out.println("pathSeparator" + File.pathSeparator); 	//pathSeparator;
		System.out.println("Separator" + File.separator); 			//Separator\
		
		System.out.println(f1.exists());	//������ �����ϴ��� Ȯ���ϴ¹��
		System.out.println(f1.isFile());	//�����ΰ�?
		
		System.out.println(f2.exists());		//���丮�� �����ϴ°�? Ȯ���ϴ¹��
		System.out.println(f2.isDirectory());	//���丮�ΰ�?
		System.out.println(f2.isAbsolute());	//���밪�ΰ�?(�ۼַ�Ʈ)
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());		//��� ���� �̸��� ���
		
		System.out.println(f1.getPath());		//�̸��� ��µȴ�
		System.out.println(f2.getPath());		//��ΰ� ��µȴ�.
		System.out.println(f2.getParent());		//������ΰ� ��µȴ�.
		
		File f3 = new File("abc.txt");
		if(!f3.exists())
			if(f3.createNewFile()) System.out.println("������ ������");
			else System.out.println("������ �������� ����");
		else
			System.out.println("�̹� ������ �����Ѵ�!");
	}

}
