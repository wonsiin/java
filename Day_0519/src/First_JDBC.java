import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First_JDBC {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";			//드라이버 주소값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//
		String nsrname = "hr";														
		String password = "hr";
		
		Connection conn = null;
		Statement stat = null;
		String query = null;
		
		//1.드라이버를 메모리로 로딩
		try {
			Class.forName(driver);
			System.out.println("드라이버 프로그램을 메모리에 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 프로그램을 메모리에 로딩 실패");
			e.printStackTrace();
		}
		
		//2. Oracle에 접속 시도
		try {
			conn = DriverManager.getConnection(url, nsrname, password);
			System.out.println("DB 오라클 접속 성공");
		// ;은 가져가면 안된다.
			query = "CREATE TABLE test1("
					+ "usrname 	 VARCHAR2(20),"
					+ "age NUMBER(3))";
			
			stat = conn.createStatement();
			stat.executeQuery(query); //쿼리를보냄
			
		} catch (SQLException e) {
			System.out.println("DB 오라클 접속 실패");
			e.printStackTrace();
		}finally {
				try {
					if(conn != null) conn.close();
					if(stat != null)stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		System.out.println("끝");
	}

}
