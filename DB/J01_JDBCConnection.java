/*
	The module system has mainly the following impact on the code:
	모듈 시스템은 주로 코드에 다음과 같은 영향을 미칩니다.

	A package can only be accessed from one module
	패키지는 하나의 모듈에서만 액세스할 수 있습니다

	( Nested packages are treated as separate,
	( 중첩 패키지는 별도의 패키지로 처리되는데,
	
	so even though the package java.util is in the module java.base,
	패키지 java.util 안의 모듈 java.base,
	
	the package java.util.logging can be in the module java.logging)
	패키지 java.util.logging 안의 모듈 java.logging
	
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
	
	

(중첩 패키지는 별도의 패키지로 처리되므로 패키지 java.util가 모듈에 있더라도 패키지 는 모듈 java.base에 있을 java.util.logging수 있음 java.logging)
다른 모듈의 내보낸 패키지에 있는 코드의 공개 필드 및 메서드에만 액세스할 수 있습니다. 이는 리플렉션이 있는 경우에도 마찬가지입니다(즉 java.lang.reflect.AccessibleObject.setAccessible(boolean), 동일한 모듈의 코드에서만 작동함)
클래스 경로에 있는 모든 코드는 "이름 없는" 모듈에 함께 있습니다. 모듈 경로의 모든 코드는 자체 "명명된" 모듈에 있습니다.

두 가지 경우를 구별해야 합니다.

module-info.java를 프로젝트에 추가하지 않으면 프로젝트가 이름 없는 모듈의 일부가 되고 이름 없는 모듈의 다른 모든 코드 java.base와 java.se루트 모듈의 모듈 및 코드를 볼 수 있습니다 . 기본적으로 이것은 클래스 경로의 wrt 코드, 모든 것이 여전히 Java 8에서와 같이 작동한다는 것을 의미하므로 클래스 경로에 종속성을 넣어야 합니다.

프로젝트에 module-info.java가 있는 경우 프로젝트는 고유한 명명된 모듈에 있으며 java.basemodule-info.java에서 "requires" 절을 사용하는 참조인 다른 명명된 모듈 및 내부 코드만 볼 수 있습니다 . 명명된 모듈은 모듈 경로를 통해서만 찾을 수 있으므로 종속성을 모듈 경로에 넣어야 합니다. 이것은 .jar 파일 이름에서 파생된 모듈 이름을 가져오는 Java 9 이전에 생성된 jar에서도 작동합니다(이 경우 "자동" 모듈이라고 함).

JRE는 항상 모듈 경로에 있으므로 클래스 경로의 코드에서도 내부 코드에 액세스할 수 없습니다.

한 가지 특별한 경우가 있습니다. 프로젝트에 module-info.java가 있고 프로젝트에 테스트 코드가 있는 경우 일반적으로 module-info.java. 이에 대한 두 가지 솔루션이 있습니다.

전용 테스트 모듈을 만듭니다. 이것은 항상 osgi 기반 프로젝트의 관례였습니다. 단점은 테스트에서 공개 API만 사용할 수 있다는 것입니다.

Maven에서 사용하는 솔루션 : 테스트 종속성을 클래스 경로에 넣습니다. 테스트 코드를 컴파일할 때 Maven은 명명된 모듈의 코드가 명명되지 않은 모듈을 읽을 수 있도록 하는 명령줄 옵션을 추가합니다(module-info.java를 통해 가능하지 않음).

Eclipse Oxygen에서는 어떤 코드가 테스트 코드인지에 대한 개념이 없기 때문에 Maven 솔루션이 불가능했지만 6월에 나올 예정인 Eclipse Photon (4.8) 릴리스 에서 구현되었습니다 . http://download.eclipse.org/eclipse/downloads/ 에서 이미 (기능이 완성된) 마일스톤 빌드로 작업할 수 있습니다 . 버그를 발견한 경우 https://bugs.eclipse.org/bugs/ 에서 보고 하십시오 .
 */

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JDBCConnection {
	
	/*
		# JDBC 라이브러리
		  - JAVA Database Connectivity
		  - DB에 쿼리문을 전달해 실행하고 결과를 받아오는 JAVA API
		  - 다양한 종류의 DB와 연결될 수 있도록 설계되어 있다.
		  - Java 소스 코드는 어떤 DB와 연결하더라도 항상 일정하다.
		  
		# OJDBC 라이브러리
		  - 오라클 데이터베이스가 JDBC API와 소통하기 위해 만들어놓은 라이브러리
		  - 오라클 DB가 설치된 폴더 내부에 포함되어 있다.
		
		
		# 오라클DB 나 오라클개발자툴 폴더 안에 JDBC 폴더 존재
		  @ 라이브러리에 추가
		  - 프로젝트 폴더 우클릭 - 빌드패스 - ADD EX 뭐시기 클릭 - 경로들어가서 추가
	*/
	public static void main(String[] args) {
		
		int count = 0;
		// 1. Class.forName() 으로 JDBC 드라이버를 로드한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 로드 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 로드 오류");
		}
		
		// 2.  DriverManager 클래스를 통해 DB에 연결한다.
		// @ 뒤는 자기 자신 ip 주소를 적으면 된다.
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521/XE",
					"hr",
					"1234");
			System.out.println("DB 로그인 성공");
			
			//3. 생성된 연결을 통해 원하는 쿼리문을 전달
			
			// 3-1 구문 준비하기
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 3-2 실행 후 결과 받아오기
			ResultSet rs = pstmt.executeQuery();
			
			// 4. 받아온 쿼리 결과를 마음껏 사용한다.
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
			
			// 5. 다 사용한 연결은 반드시 닫아야 한다. (늦게 생성한 순서대로 객체를 닫아준다.)
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("DB 로그인 실패");
		} finally {
			
		}
	}
}
