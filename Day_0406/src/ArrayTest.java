
public class ArrayTest {

	public static void main(String[] args) {
		//동일한 데이터 타입으로 여러개 선언해서 사용할때
		//프로그램의 실행도중 배열의 크기를 수정할 수 없다.
		int a = 10;
		int[] ary = new int[10]; //방 10개를 생성 [heap공간에 생성]   4bite * 10 = 40bite의 공간을 생성
		
		int[] ary1 = new int[] {1,2,3,4,5}; //1번째 초기화 방법 [new int[]칸에 방생성값을 적으면 안된다] 4bite * 5 = 20bite
		int[] ary2 = {11,22,33,44,55};		//2번째 초기화 방법 [c언어에서 사용하는 방법].
		
		double[] dary1 = new double[5]; // 8bite * 5 = 40bite
		String name = "홍길동";
		String[] sary = new String[5];
		String[] sary2 = {"홍", "임","최,","김","박"};
		System.out.println("args의 길이 : " + args.length);
		
	
		
		
		int[] iary;
		iary = new int[5]; //선언 후 생서 가능
		
		for(int i=0; i<10; ++i) { //i 변수를 생성하여 i가 10보다 작으면 i를 1씩 증가시켜라
			ary[i] = i*10;		  //i 값이되면 i값 * 10을 계산하여 ary[i]에 넣어라
		}						  //
		for(int i=0;i<ary.length;++i) { //i 변수를 생성 후 i값이 ary의 길이 보다 작으면 i를 1씩 증가시켜라.
			System.out.println(ary[i]);
		}

	}

}
