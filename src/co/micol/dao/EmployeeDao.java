package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.dto.jobDto;  //패키지가다르므로 임포트 시켜줌

public class EmployeeDao {
	private Connection conn;
//	private PreparedStatement psmt;
//	private ResultSet rs; // select 구문 결과값받기위해

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";

	public EmployeeDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
//
//	public void select() {
//		jobDto dto = new jobDto();  //jobDto 클래스 인스턴스를 생성
//		String sql = "select * from jobs";
//		try {
//			psmt = conn.prepareStatement(sql); //프리스테이츠먼츠=쿼리를 미리 넣어줌
//			rs = psmt.executeQuery();  //리절트셋
//			
//			while (rs.next()) {
//				dto.setJob_id(rs.getString("job_id"));  //APP의 result set(rs) class 에 담아서 옴
//				dto.setJob_title(rs.getString("job_title")); // "job_id" 대신 인덱스 1,2,3..번호로 해도 됨 
//				dto.setMin_salary(rs.getInt("Min_salary"));
//				dto.setMax_salary(rs.getInt("Max_salary"));
//				
//				dto.toString();  // (공부용이고 여기에 안함) 호출해서 toString불러 작업시킴 출력함
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {  //connectio ㅍㄹ일때는 finally는 안해도 됨
//			try {
//				if (rs != null)
//					if (psmt != null)
//						psmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
