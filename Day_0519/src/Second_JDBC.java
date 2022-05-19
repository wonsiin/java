import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second_JDBC {

	public static void main(String[] args) {
		//0. �غ�
		String driver = "oracle.jdbc.driver.OracleDriver";			//����̹� �ּҰ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url ��
		String nsrname = "hr";														
		String password = "hr";
		
		Connection conn = null;		//Ŀ�ؼ� ��ü
		Statement stat = null;			// ���常������� ������Ʈ��Ʈ
		String query = null;				//���ڿ�
		String usrname = "�տ���";
		int age = 12;
		
		try {
			Class.forName(driver);			//DRIVER �ε�
			conn = DriverManager.getConnection(url, nsrname, password);
			query = "INSERT INTO test1"
					+ " (usrname, age) "
					+ "VALUES"
					+ "('" +usrname +   "'," + age +")";
// INSERT UPDATE DELECT �� �޼����� ��� , SELECT �� ��� �����͸� �ǵ�����.
//			query = "CREATE TABLE test1("
//					+ "usrname 	 VARCHAR2(20),"
//					+ "age NUMBER(3))";
//			query = "DROP  TABLE test1";
			
			stat = conn.createStatement();
			int result = stat.executeUpdate(query);		//update insert delect ���� ���
			System.out.println(result + "���� �����߽��ϴ�.");
//			stat.executeQuery(query);	 // select ������ ���
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

		System.out.println("��");
	}

}
