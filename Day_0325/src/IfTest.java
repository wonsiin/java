import java.util.*;

public class IfTest {

	public static void main(String[] args) {
		int score = 90;
		String grade;
		Scanner a = new Scanner(System.in);
		
		
		if(score >= 90) {
			grade = "A����";
		} else if(score >= 80) {
			grade = "B����";
		} else if(score >= 70) {
			grade = "C����";
		} else {
			grade = "F����";
		}
		
		System.out.println(score + "���� " + grade);
	}

}
