package exam;

public class Test2 {
	Font gainFont = new Font("Tahoma", Font.PLAIN, 11);
	Font lostFont = new Font("Tahoma", Font.ITALIC, 11);

	textField1.setText(idHint);	// 텍스트 필드 힌트의 기본 문자
	textField1.setFont(lostFont);	// 텍스트 필드 힌트의 기본 폰트
	textField1.setForeground(Color.GRAY);	// 텍스트 필드 힌트의 기본 색상
	textField1.addFocusListener(new FocusListener() {	// 텍스트 필드 포커스 시 이벤트

		@Override
		public void focusLost(FocusEvent e) {	// 포커스를 잃었을 때,
			if (textField1.getText().equals("")) {
				textField1.setText(idHint);
				textField1.setFont(lostFont);
				textField1.setForeground(Color.GRAY);
			}
		}

		@Override
		public void focusGained(FocusEvent e) {	// 포커스를 얻었을 때,
			if (textField1.getText().equals(idHint)) {
				textField1.setText("");
				textField1.setFont(gainFont);
				textField1.setForeground(Color.BLACK);
			}
		}
	});
}
