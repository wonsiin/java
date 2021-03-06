import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JTextField;

class SwingThread extends JFrame{	//자바에서 제공해주는 창
	JTextField tf1, tf2;
	
	public SwingThread() {
		super("스레드 연습");
		setBounds(300, 300,300,200);
		
		setLayout(new FlowLayout());
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		
		add(tf1);add(tf2);
		
		setVisible(true);
		
		new ClockThread(tf1).start();
		new CountThread(tf2).start();
	}
}
//현재시간
class ClockThread extends Thread{
	JTextField target;
	ClockThread(JTextField target) {
		this.target = target;
	}
	@Override
	public void run() {
		Calendar c = null;
		String temp = null;
		
		while(true) {
			c = Calendar.getInstance();
			temp = c.get(Calendar.HOUR) + " : " +
					c.get(Calendar.MINUTE) +  " : " +
					c.get(Calendar.SECOND) ;
			target.setText(temp);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
// 정수가 증가하는 코드
class CountThread extends Thread{
	JTextField target;
	CountThread(JTextField target) {
		this.target = target;
	}
	@Override
	public void run() {
		int i = 0;
		
		while(true) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			target.setText(Integer.toString(i++));//숫자를 문자열로
		}
	}
	
}

public class GUIThread {

	public static void main(String[] args) {
		new SwingThread();

	}

}
