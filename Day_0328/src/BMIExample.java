import java.util.Scanner;

public class BMIExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double he , we , bmi ; //8개의 기초자료형은 0 false, ' '
		String re = null;				// 참조자료형 : 아무것도 참조하고 있지 않음 (String re = null;)
		
		// 키보드로 데이터를 입력받음.
		System.out.println("키를 입력하세요(cm) : ");
		he = scanner.nextDouble();
		
		System.out.println("몸무계를 입력하세요(kg) : ");
		we = scanner.nextDouble();
		
		//키를 m로 환산
		he = he * 0.01; // he = he / 100;
		bmi = we / (he * he);
		
		
		/* if(bmi >= 35){
				result = "고도비만";
			} else if(bmi >= 30) {
				result = "중도비만";
			} else if(bmi >= 25) {
				result = "경도비만";
			} else if(bmi >= 23) {
				result = "정상";
			} else if(bmi >= 18.5) {
				result = "저체중";
			} */
								
		
		if(bmi >= 35) {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 고도비만 입니다.");
			re = "고도비만 입니다.";
		} else if(bmi >= 30) {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 중도비만 입니다.");
			re = "중도비만 입니다.";
		} else if(bmi >= 25) {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 경도비만 입니다.");
			re = "경도비만 입니다.";
		} else if(bmi >= 23) {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 과체중 입니다.");
			re = "과체중 입니다.";
		} else if(bmi >= 18.5) {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 정상 입니다.");
			re = "정상 입니다.";
		} else if (bmi < 18.5){
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 저체중 입니다.");
			re = "저체중 입니다.";
		}
//		else {
//			System.out.printf("고객님은 현재 키는 " + we+ "m 몸무계는 " + we + "kg 이므로 bmi는 " + bmi + " 저체중 입니다.");
//			re = "저체중 입니다.";
//		} 불필요한 값을 처리하기보다 else를 활용하자.
		System.out.println(he + ", " + we + ", " + bmi + ", " + re); 
//		System.out.println(he + ", " + we + ", " + bmi + ", " + re); 
		System.out.printf("키 : %.2fm%n몸무계 : %.0fKg%nBMI : %.2f%n결과 : %s",he,we,bmi,re); 
		//% 는 , 다음 값을 가져와라 f : 더블형 데이터를 플룻형으로 받아서 가져온다. %.2f : 소수점2자리의 플룻형으로 출력
		//%s = 문자열을 가져올때 사용.
	}
		// 1) result를 초기화
		// 2) if문을 수정
}
