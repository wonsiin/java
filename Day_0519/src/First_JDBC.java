import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First_JDBC {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";			//����̹� �ּҰ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//
		String nsrname = "hr";														
		String password = "hr";
		
		Connection conn = null;
		Statement stat = null;
		String query = null;
		
		//1.����̹��� �޸𸮷� �ε�
		try {
			Class.forName(driver);
			System.out.println("����̹� ���α׷��� �޸𸮿� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���α׷��� �޸𸮿� �ε� ����");
			e.printStackTrace();
		}
		
		//2. Oracle�� ���� �õ�
		try {
			conn = DriverManager.getConnection(url, nsrname, password);
			System.out.println("DB ����Ŭ ���� ����");
		// ;�� �������� �ȵȴ�.
			query = "CREATE TABLE test1("
					+ "usrname 	 VARCHAR2(20),"
					+ "age NUMBER(3))";
			
			stat = conn.createStatement();
			stat.executeQuery(query); //����������
			
		} catch (SQLException e) {
			System.out.println("DB ����Ŭ ���� ����");
			e.printStackTrace();
		}finally {
				try {
					if(conn != null) conn.close();
					if(stat != null)stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		System.out.println("��");
	}

}