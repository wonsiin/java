
public class ForTest2 {

	public static void main(String[] args) {
//		System.out.println("세종대왕님이 말씀하셧다. \"나랏말쌈이 중국과 다르다.\""); //"을 하나의 문자처럼 읽히기 위해서 \ 를 사용
//		System.out.println("무궁화\t꽃\n이\'피\'었습니다.");//\t = tap, \n = 다음줄
//		System.out.printf("%d %d %d %d\n", (int)'\t',(int)'\n',(int)'\r',(int)'\\');

		
		
		for(int i=0; i <= 127; ++i) {
//			System.out.print(i + " : " + (char)i +" ");
			System.out.printf("%3d : %c ",i,(char)i); //출력할 자리수 확보
			if(i % 5 == 0) System.out.println();
		}

	}

}
//, i + (char)i, i + (char)i, i + (char)i, i + (char)i 