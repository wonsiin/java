import java.util.*;

public class IfTest {

	public static void main(String[] args) {
		int score = 90;
		String grade;
		Scanner a = new Scanner(System.in);
		
		
		if(score >= 90) {
			grade = "A학점";
		} else if(score >= 80) {
			grade = "B학점";
		} else if(score >= 70) {
			grade = "C학점";
		} else {
			grade = "F학점";
		}
		
		System.out.println(score + "점은 " + grade);
	}

}
