import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second_JDBC {

	public static void main(String[] args) {
		//0. 준비
		String driver = "oracle.jdbc.driver.OracleDriver";			//드라이버 주소값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url 값
		String nsrname = "hr";														
		String password = "hr";
		
		Connection conn = null;		//커넥션 객체
		Statement stat = null;			// 문장만들기위해 스테이트먼트
		String query = null;				//문자열
		String usrname = "손오공";
		int age = 12;
		
		try {
			Class.forName(driver);			//DRIVER 로딩
			conn = DriverManager.getConnection(url, nsrname, password);
			query = "INSERT INTO test1"
					+ " (usrname, age) "
					+ "VALUES"
					+ "('" +usrname +   "'," + age +")";
// INSERT UPDATE DELECT 는 메세지만 출력 , SELECT 는 결과 데이터를 되돌려줌.
//			query = "CREATE TABLE test1("
//					+ "usrname 	 VARCHAR2(20),"
//					+ "age NUMBER(3))";
//			query = "DROP  TABLE test1";
			
			stat = conn.createStatement();
			int result = stat.executeUpdate(query);		//update insert delect 에서 사용
			System.out.println(result + "개를 저장했습니다.");
//			stat.executeQuery(query);	 // select 에서만 사용
		} catch (ClassNotFoundException | SQLException e) {
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
