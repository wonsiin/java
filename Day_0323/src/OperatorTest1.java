
public class OperatorTest1 {
	public static void main(String[] args) {
		//변수 선언, 초기화
		//181.5키, 72.9 몸무계
		double height = 181.5;
		double weight = 72.9;
		//double bmi;
		//출력
		System.out.println(height/100 + "m");
		System.out.println(weight + "kg");
		System.out.println("저의 키는 "+height+"m 이고, 몸무계는 "+weight+"kg 입니다.");
		//cm = m로
		//연습 1에서 m로 환산 data를 이용해서 체질량 지수를 구해 출력하시오. bmi = 몸무계(kg)을 키(m)의 제곱으로 나눈값
		// height = height * 0.01;
		// bmi = weight / (height * height)
		double a = height / 100;
		double b = a * a;
		double c = weight / b;
		System.out.println("키의 제곱값은 "+b +" bmi값은 " + c+" 입니다.");
		
		
		

		
	}
}
