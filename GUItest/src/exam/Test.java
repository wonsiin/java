package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Test {
	// "로그인" 버튼 클릭 이벤트
		private ActionListener login = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField1.getText();
				String pw = textField2.getText();
				if (textField1.getText().equals(idHint) || textField2.getText().equals(pwHint)) {
					jLabel4.setVisible(true);
				} else {
					if (bd.checkIdPw(id, pw)) {
						System.out.println("아이디 확인");
						jLabel1.setVisible(false);
						new SelectAllGui(id);
						dispose();
					} else {
						System.out.println("로그인 오류");
						jLabel4.setVisible(true);
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요!");
					}
				}
			}
		}; // end login trigger
}
