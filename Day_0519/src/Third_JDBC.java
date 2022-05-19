import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Third_JDBC {

	public static void main(String[] args) {
		//0. �غ�
		String driver = "oracle.jdbc.driver.OracleDriver";			//����̹� �ּҰ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url ��
		String nsrname = "hr";														//oracle id��
		String password = "hr";														//oracle pw��
		Scanner sc = new Scanner(System.in);
		Connection conn = null;		//Ŀ�ؼ� ��ü
		Statement stat = null;			// ���常������� ������Ʈ��Ʈ
		String query = null;				//���ڿ�
		String usrname="";
		int age =0;
		int result;
		
			try {
				Class.forName(driver);			//DRIVER �ε�
				conn = DriverManager.getConnection(url, nsrname, password); //���� ����
				//POOL : Ŀ�ؼ� POOL Ŀ�ؼǸ� �����س��� ������� �̰����� ����ϰ� ����°�
				//������ 1���� ó��
				
				while(true) {
					System.out.print("�̸��� �Է��ϼ��� : ");
					usrname = sc.nextLine();
					if(usrname.equals("")) {
						//if(usrname.length()==0)
						System.out.println("�����մϴ�.");
						return;
					}
					System.out.print("���̸� �Է��ϼ��� : ");
					age = sc.nextInt();
					sc.nextLine();
				
				query = "INSERT INTO test1"
						+ " (usrname, age) "
						+ "VALUES"
						+ "('" +usrname +   "'," + age +")";
				
//				query = "DROP TABLE test1";

				stat = conn.createStatement();
				result = stat.executeUpdate(query);
				System.out.println(result + "���� �����߽��ϴ�.");
//				stat.executeQuery(query);	 // select ������ ���
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
