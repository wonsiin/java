import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		double bmi;
		
		System.out.println("키값을 입력하세요 : ");
		Scanner k = new Scanner(System.in);
		int kk = k.nextInt();
		double ki = kk *0.01;
		ki = Math.round(ki*100)/100.0;
		
		
		System.out.println("몸무계값을 입력하세요 : ");
		Scanner mo = new Scanner(System.in);
		int mmo = mo.nextInt();
		double kaka = (ki * ki);
		bmi = mmo / kaka;
		bmi = Math.round(bmi*100)/100.0;
		
		if(bmi >= 35) {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 고도비만 입니다.",ki,mmo,bmi);
		} else if(bmi >= 30) {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 중도비만 입니다.",ki,mmo,bmi);
		} else if(bmi >= 25) {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 경도비만 입니다.",ki,mmo,bmi);
		} else if(bmi >= 23) {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 과체중 입니다.",ki,mmo,bmi);
		} else if(bmi >= 18.5) {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 정상 입니다.",ki,mmo,bmi);
		} else {
			System.out.printf("고객님은 현재 키는 %sm 몸무계는 %skg 이므로 %s값이므로 저체중 입니다.",ki,mmo,bmi);
		}
		
		
	}

}
