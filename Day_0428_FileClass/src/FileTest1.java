import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
		//File Class : 스트림이 아니다.하드디스크상의 물리적인 파일이나 경로를 나타내는 추상적인 정보
		//File 객체를 생성한다고 해서 파일이 생성되는 것은 아니다.
		// 윈도우 : C:\workspace\Test_Java\Day_0428	: 역슬래시
		// 인터넷 : https://n.news.naver.com/article/081/0003269191?cds=news_media_pc&type=editn : 슬래시가 경로다.
		//														 ?cds=news_media_pc&type=editn : 지워도 상관은 없다.
		// 리눅스 , 유닉스 : / 로 표시 예) : /workspace/Test_Java/Day_0428
		File f1 = new File("test.java");
		File f2 = new File("C:/workspace"); // \n \t 로 인식하기때문에 2개를 사용
												//C드라이브 에서 시작하면 절대경로, 현재 문서에서 작업하는건 상대경로
		System.out.println("pathSeparator" + File.pathSeparator); 	//pathSeparator;
		System.out.println("Separator" + File.separator); 			//Separator\
		
		System.out.println(f1.exists());	//파일이 존재하는지 확인하는방법
		System.out.println(f1.isFile());	//파일인가?
		
		System.out.println(f2.exists());		//디렉토리가 존재하는가? 확인하는방법
		System.out.println(f2.isDirectory());	//디렉토리인가?
		System.out.println(f2.isAbsolute());	//절대값인가?(앱솔루트)
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());		//경로 빼고 이름만 출력
		
		System.out.println(f1.getPath());		//이름이 출력된다
		System.out.println(f2.getPath());		//경로가 출력된다.
		System.out.println(f2.getParent());		//상위경로가 출력된다.
		
		File f3 = new File("abc.txt");
		if(!f3.exists())
			if(f3.createNewFile()) System.out.println("파일이 생성됨");
			else System.out.println("파일이 생성되지 못함");
		else
			System.out.println("이미 파일이 존재한다!");
	}

}
