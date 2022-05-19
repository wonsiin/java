import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Third_JDBC {

	public static void main(String[] args) {
		//0. 준비
		String driver = "oracle.jdbc.driver.OracleDriver";			//드라이버 주소값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url 값
		String nsrname = "hr";														//oracle id값
		String password = "hr";														//oracle pw값
		Scanner sc = new Scanner(System.in);
		Connection conn = null;		//커넥션 객체
		Statement stat = null;			// 문장만들기위해 스테이트먼트
		String query = null;				//문자열
		String usrname="";
		int age =0;
		int result;
		
			try {
				Class.forName(driver);			//DRIVER 로딩
				conn = DriverManager.getConnection(url, nsrname, password); //계정 연동
				//POOL : 커넥션 POOL 커넥션만 생성해놔서 사람들이 이곳으로 사용하게 만드는곳
				//위까지 1번만 처리
				
				while(true) {
					System.out.print("이름을 입력하세요 : ");
					usrname = sc.nextLine();
					if(usrname.equals("")) {
						//if(usrname.length()==0)
						System.out.println("종료합니다.");
						return;
					}
					System.out.print("나이를 입력하세요 : ");
					age = sc.nextInt();
					sc.nextLine();
				
				query = "INSERT INTO test1"
						+ " (usrname, age) "
						+ "VALUES"
						+ "('" +usrname +   "'," + age +")";
				
//				query = "DROP TABLE test1";

				stat = conn.createStatement();
				result = stat.executeUpdate(query);
				System.out.println(result + "개를 저장했습니다.");
//				stat.executeQuery(query);	 // select 에서만 사용
				}
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


	}

}
