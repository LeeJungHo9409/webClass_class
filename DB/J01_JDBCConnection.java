/*
	The module system has mainly the following impact on the code:
	��� �ý����� �ַ� �ڵ忡 ������ ���� ������ ��Ĩ�ϴ�.

	A package can only be accessed from one module
	��Ű���� �ϳ��� ��⿡���� �׼����� �� �ֽ��ϴ�

	( Nested packages are treated as separate,
	( ��ø ��Ű���� ������ ��Ű���� ó���Ǵµ�,
	
	so even though the package java.util is in the module java.base,
	��Ű�� java.util ���� ��� java.base,
	
	the package java.util.logging can be in the module java.logging)
	��Ű�� java.util.logging ���� ��� java.logging
	
You can only access public fields and methods of code in exported packages of other modules. This is true even with reflection (i.e. java.lang.reflect.AccessibleObject.setAccessible(boolean) only works for code in the same module)
All code that is on the classpath lives together in the "unnamed" module. All code on the modulepath lives in their own "named" modules.

You have to distinguish two cases:

If you don't add a module-info.java to your project, your project will be part of the unnamed module and can see all other code in the unnamed module, plus code in java.base and code in modules in java.se root module. Basically this means that w.r.t. code on the classpath, everything still works as in Java 8, so you should just put your dependencies on the classpath.

If you have a module-info.java in your project, your project will be in its own named module and can only see code in java.base and other named modules which are references using "requires"-clauses in the module-info.java. As named modules are only found via the module path, you should put your dependencies on the module path. This even works for jars created before Java 9, which will get a module name derived from the .jar file name (in which case they are called "automatic" module).

The JRE is always on the module-path, so that its internal code cannot be accessed even from code on the classpath.

There is one special case: If you have a module-info.java in your project and have test code in your project, you usually don't want to mention test dependencies like junit in the module-info.java. There are two solutions for this:

Create a dedicated test module. This has always been the convention for osgi-based projects. Disadvantage is that you can only use public API in your tests

The solution used by Maven: Put your test dependencies on the classpath. When compiling test code, Maven adds command line options that allow the code in the named module to read the unnamed module (which is not possible via the module-info.java).

In Eclipse Oxygen, the Maven solution was not possible, because it has no notion which code is test code, but this has been implemented in the upcoming Eclipse Photon (4.8) release, which will be out in June. You can already work with the (feature-complete) milestone builds from http://download.eclipse.org/eclipse/downloads/. In case you find any bugs, please report them at https://bugs.eclipse.org/bugs/.
	
	

(��ø ��Ű���� ������ ��Ű���� ó���ǹǷ� ��Ű�� java.util�� ��⿡ �ִ��� ��Ű�� �� ��� java.base�� ���� java.util.logging�� ���� java.logging)
�ٸ� ����� ������ ��Ű���� �ִ� �ڵ��� ���� �ʵ� �� �޼��忡�� �׼����� �� �ֽ��ϴ�. �̴� ���÷����� �ִ� ��쿡�� ���������Դϴ�(�� java.lang.reflect.AccessibleObject.setAccessible(boolean), ������ ����� �ڵ忡���� �۵���)
Ŭ���� ��ο� �ִ� ��� �ڵ�� "�̸� ����" ��⿡ �Բ� �ֽ��ϴ�. ��� ����� ��� �ڵ�� ��ü "����" ��⿡ �ֽ��ϴ�.

�� ���� ��츦 �����ؾ� �մϴ�.

module-info.java�� ������Ʈ�� �߰����� ������ ������Ʈ�� �̸� ���� ����� �Ϻΰ� �ǰ� �̸� ���� ����� �ٸ� ��� �ڵ� java.base�� java.se��Ʈ ����� ��� �� �ڵ带 �� �� �ֽ��ϴ� . �⺻������ �̰��� Ŭ���� ����� wrt �ڵ�, ��� ���� ������ Java 8������ ���� �۵��Ѵٴ� ���� �ǹ��ϹǷ� Ŭ���� ��ο� ���Ӽ��� �־�� �մϴ�.

������Ʈ�� module-info.java�� �ִ� ��� ������Ʈ�� ������ ���� ��⿡ ������ java.basemodule-info.java���� "requires" ���� ����ϴ� ������ �ٸ� ���� ��� �� ���� �ڵ常 �� �� �ֽ��ϴ� . ���� ����� ��� ��θ� ���ؼ��� ã�� �� �����Ƿ� ���Ӽ��� ��� ��ο� �־�� �մϴ�. �̰��� .jar ���� �̸����� �Ļ��� ��� �̸��� �������� Java 9 ������ ������ jar������ �۵��մϴ�(�� ��� "�ڵ�" ����̶�� ��).

JRE�� �׻� ��� ��ο� �����Ƿ� Ŭ���� ����� �ڵ忡���� ���� �ڵ忡 �׼����� �� �����ϴ�.

�� ���� Ư���� ��찡 �ֽ��ϴ�. ������Ʈ�� module-info.java�� �ְ� ������Ʈ�� �׽�Ʈ �ڵ尡 �ִ� ��� �Ϲ������� module-info.java. �̿� ���� �� ���� �ַ���� �ֽ��ϴ�.

���� �׽�Ʈ ����� ����ϴ�. �̰��� �׻� osgi ��� ������Ʈ�� ���ʿ����ϴ�. ������ �׽�Ʈ���� ���� API�� ����� �� �ִٴ� ���Դϴ�.

Maven���� ����ϴ� �ַ�� : �׽�Ʈ ���Ӽ��� Ŭ���� ��ο� �ֽ��ϴ�. �׽�Ʈ �ڵ带 �������� �� Maven�� ���� ����� �ڵ尡 ������ ���� ����� ���� �� �ֵ��� �ϴ� ����� �ɼ��� �߰��մϴ�(module-info.java�� ���� �������� ����).

Eclipse Oxygen������ � �ڵ尡 �׽�Ʈ �ڵ������� ���� ������ ���� ������ Maven �ַ���� �Ұ��������� 6���� ���� ������ Eclipse Photon (4.8) ������ ���� �����Ǿ����ϴ� . http://download.eclipse.org/eclipse/downloads/ ���� �̹� (����� �ϼ���) ���Ͻ��� ����� �۾��� �� �ֽ��ϴ� . ���׸� �߰��� ��� https://bugs.eclipse.org/bugs/ ���� ���� �Ͻʽÿ� .
 */

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JDBCConnection {
	
	/*
		# JDBC ���̺귯��
		  - JAVA Database Connectivity
		  - DB�� �������� ������ �����ϰ� ����� �޾ƿ��� JAVA API
		  - �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�.
		  - Java �ҽ� �ڵ�� � DB�� �����ϴ��� �׻� �����ϴ�.
		  
		# OJDBC ���̺귯��
		  - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯��
		  - ����Ŭ DB�� ��ġ�� ���� ���ο� ���ԵǾ� �ִ�.
		
		
		# ����ŬDB �� ����Ŭ�������� ���� �ȿ� JDBC ���� ����
		  @ ���̺귯���� �߰�
		  - ������Ʈ ���� ��Ŭ�� - �����н� - ADD EX ���ñ� Ŭ�� - ��ε��� �߰�
	*/
	public static void main(String[] args) {
		
		int count = 0;
		// 1. Class.forName() ���� JDBC ����̹��� �ε��Ѵ�.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC �ε� ����");
		}
		
		// 2.  DriverManager Ŭ������ ���� DB�� �����Ѵ�.
		// @ �ڴ� �ڱ� �ڽ� ip �ּҸ� ������ �ȴ�.
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521/XE",
					"hr",
					"1234");
			System.out.println("DB �α��� ����");
			
			//3. ������ ������ ���� ���ϴ� �������� ����
			
			// 3-1 ���� �غ��ϱ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 3-2 ���� �� ��� �޾ƿ���
			ResultSet rs = pstmt.executeQuery();
			
			// 4. �޾ƿ� ���� ����� ������ ����Ѵ�.
			System.out.println("employee_id\tfirst_name\t"
					+ "job_id\t\tsalary\n");
			while (rs.next()) {
				System.out.printf("%d\t\t%s\t\t%s\t\t%.2f\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("job_id"),
						rs.getDouble("salary"));
				//System.out.println(rs.getString("first_name"));
			}
			
			// 5. �� ����� ������ �ݵ�� �ݾƾ� �Ѵ�. (�ʰ� ������ ������� ��ü�� �ݾ��ش�.)
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("DB �α��� ����");
		} finally {
			
		}
	}
}
