package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원 가입");
		lblNewLabel.setBounds(277, 71, 174, 47);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 : ");
		lblNewLabel_1.setBounds(31, 157, 77, 24);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(115, 154, 522, 30);
		textField.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("아이디 중복 체크");
		btnNewButton.setBounds(458, 190, 179, 33);
		btnNewButton.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 : ");
		lblNewLabel_2.setBounds(12, 238, 96, 24);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 235, 522, 30);
		textField_1.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("이름 : ");
		lblNewLabel_3.setBounds(12, 304, 96, 24);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 301, 522, 30);
		textField_2.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("10 ) 기획 20 ) 영업 30 ) 개발 40 ) 협업툴관리자");
		lblNewLabel_5.setBounds(115, 367, 677, 24);
		lblNewLabel_5.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("팀 번호 : ");
		lblNewLabel_4.setBounds(12, 400, 96, 24);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 397, 522, 30);
		textField_3.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("회원가입 완료");
		btnNewButton_1.setBounds(115, 553, 236, 33);
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setFont(new Font("궁서", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("뒤로 가기");
		btnNewButton_2.setFont(new Font("궁서", Font.PLAIN, 20));
		btnNewButton_2.setBounds(397, 553, 240, 33);
		contentPane.add(btnNewButton_2);
	}
}
