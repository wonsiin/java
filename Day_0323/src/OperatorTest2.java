
public class OperatorTest2 {
	public static void main(String[] args) {
		//한 학생의 세과목의 점수를 저장할 변수를 선언하고 각각 80, 85, 90 점으로 초기화 합계와 평균을 구하는 프로그램 작성
		int gu = 80;
		int eng = 86;
		int su = 90;
		int hap = gu+eng+su;
		double pu = hap / 3; //int/int = int (int/double = double/double= double)
//		double pu = hap / 3.0; //잠시 double로 바꿔서 계산하여 소수점이 출력됨
		System.out.println("합계는 "+ hap +"점, 평균값은 "+ pu +"점 입니다.");
		
	}
}
