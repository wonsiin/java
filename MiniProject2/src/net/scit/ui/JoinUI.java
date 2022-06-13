package net.scit.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;

import net.scit.dao.UserDAO;

public class JoinUI extends JFrame {
	
	ActionListener join = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if {(usrid.getText().equals(id) || pw.getText().equals(pwe)
					|| usrname.getText().equals(na) || teamnum.getText().equals(num))
				jLabel6.setText("모든 항목을 입력해주세요");
			} else {
				if (usrid.getText().length() > 10) {
					jLabel6.setText("아이디가 너무 깁니다.\n(영문, 숫자 조합 10자 이내)");
				} else if (pw.getText().length() > 8) {
					jLabel6.setText("비밀번호가 너무 깁니다.\n(영문, 숫자 조합 8자 이내)");
				} else if (usrname.getText().length() > 11) {
					jLabel6.setText("전화번호가 너무 깁니다.\n(숫자 11자 이내)");
				} else if (teamnum.getText().length() > 8) {
					jLabel6.setText("이름이 너무 깁니다.\n(한글 8자 이내)");
				} else {
					vo = new UserinfoVo(usrid.getText(), pw.getText(), usrname.getText(),
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
	
	
	
	// 회원가입ui
	Scanner sc = new Scanner(System.in);
	UserDAO dao = new UserDAO();
	
	//생성자
//	public JoinUI() {
//		input();
//	}
	//가입창
	private void input() {
		// "등록" 이벤트
		

		// "초기화" 버튼 이벤트
		ActionListener initTextField = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				usrid.setText(id);
				pw.setText(pwe);
				jTextField3.setText(phHint);
				jTextField4.setText(nameHint);
			}
		}; // init end
	}
}
				
				
		
		
		
//		System.out.println(">10자 이내로 작성해주세요.");
//		System.out.print("> ID를 입력하세요 : ");
//		usrid = sc.nextLine();
//		if (usrid.trim().equals("")) {
//			System.out.println("문자로 입력해주세요");
//			return;
//		}
//		if (dao.findById(usrid) != null) {
//			System.out.println("아이디가 중복됩니다.");
//			return;
//		}
//		if (usrid.length() > 10) {
//			System.out.println("길이를 10자 이내로 맞춰주세요.");
//			return;
//		}
//		System.out.println(">15자 이내로 비밀번호를 작성해주세요.");
//		System.out.print("> 비밀번호를 입력하세요 : ");
//		pw = sc.nextLine();
//		
//		if (pw.length() > 15) {
//			System.out.println("길이를 15자 이내로 맞춰주세요.");
//			return;
//		}
//		System.out.println(">이름을 30자 이내로 만들어주세요.");
//		System.out.println("> 이름을 입력하세요 : ");
//		usrname = sc.nextLine();
//		if (usrname.trim().equals("")) { // 글자만 입력할수있게 다른게 들어오면 입력안되게
//			System.out.println("문자로 입력해주세요");
//			return;
//		}
//		if (usrname.length() > 30) {
//			System.out.println("길이를 30자 이내로 맞춰주세요.");
//			return;
//		}
//		System.out.println(" 10) 기획    20) 영업   30) 인사   40) 개발");
//		System.out.print("> 팀번호를 입력하세요 :  ");
//		teamnum = sc.nextLine();
//		if(teamnum.equals(0)) {
//			System.out.println("더이상 생성하실수 없습니다.");
//			return;
//		}
//				System.out.println();
//				int aa = Integer.parseInt(teamnum);
//				if(aa == '0') {
//					System.out.println("더이상 생성하실수 없습니다.");
//					return;
//				}
//				 //값 비교하기 위한
//				if(aa != 10 && aa != 20&& aa != 30&& aa != 40&& aa != 0) {
//					//추가할부분 0직업의 값은 1개 이상이면 생성불가.
//					System.out.println("팀번호를 잘못 입력하셧습니다. 다시 입력해 주세요.");
//					return;
//				}
//			
//				
//				UserVO uservo = new UserVO(usrid, pw, usrname, teamnum);
//
//				dao.joinBoard(uservo);
//				
//				System.out.printf("회원가입이 완료되었습니다.");	
//
//		new LoginUI();
//	}
//	
//
//}
