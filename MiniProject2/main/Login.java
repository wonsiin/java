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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("협업툴에 오신것을 환영합니다!");
		lblNewLabel.setBounds(90, 51, 493, 72);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("궁서", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID : ");
		lblNewLabel_1.setBounds(90, 183, 62, 35);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("궁서", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(182, 180, 401, 41);
		textField.setFont(new Font("궁서", Font.PLAIN, 30));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("P W : ");
		lblNewLabel_2.setBounds(70, 293, 82, 35);
		lblNewLabel_2.setFont(new Font("궁서", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 290, 401, 41);
		textField_1.setFont(new Font("궁서", Font.PLAIN, 30));
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setFont(new Font("궁서", Font.PLAIN, 30));
		btnNewButton.setBounds(12, 427, 187, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("비밀번호 찾기");
		btnNewButton_1.setFont(new Font("궁서", Font.PLAIN, 30));
		btnNewButton_1.setBounds(211, 427, 240, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원가입");
		btnNewButton_2.setFont(new Font("궁서", Font.PLAIN, 30));
		btnNewButton_2.setBounds(463, 427, 187, 35);
		contentPane.add(btnNewButton_2);
	}
}
