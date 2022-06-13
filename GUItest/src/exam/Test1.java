package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Test1 {
	private ActionListener userJoin = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (jTextField1.getText().equals(idHint) || jTextField2.getText().equals(pwHint)
					|| jTextField3.getText().equals(phHint) || jTextField4.getText().equals(nameHint)) {
				jLabel6.setText("모든 항목을 입력해주세요");
			} else {
				if (jTextField1.getText().length() > 10) {
					jLabel6.setText("아이디가 너무 깁니다.\n(영문, 숫자 조합 10자 이내)");
				} else if (jTextField2.getText().length() > 8) {
					jLabel6.setText("비밀번호가 너무 깁니다.\n(영문, 숫자 조합 8자 이내)");
				} else if (jTextField3.getText().length() > 11) {
					jLabel6.setText("전화번호가 너무 깁니다.\n(숫자 11자 이내)");
				} else if (jTextField4.getText().length() > 8) {
					jLabel6.setText("이름이 너무 깁니다.\n(한글 8자 이내)");
				} else {
					vo = new UserinfoVo(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(),
							jTextField4.getText());
					bd = UserinfoDao.getInstance();
					
					if (!bd.idcheck(vo.getId())) {
						bd.insert(vo);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다");
					}
				}
			}

		}
	}; // userJoin end

	// "초기화" 버튼 이벤트
	private ActionListener initTextField = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			jTextField1.setText(idHint);
			jTextField2.setText(pwHint);
			jTextField3.setText(phHint);
			jTextField4.setText(nameHint);
		}
	}; // init end
}
