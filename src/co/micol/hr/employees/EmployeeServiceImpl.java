package co.micol.hr.employees;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl extends DAO implements EmployeeService {

	private PreparedStatement psmt;
	private ResultSet rs;
	private List<EmployeeDto> list;
	private final String All_SELECT = "select * from employees";

	public List<EmployeeDto> allSelect() throws SQLException {
		EmployeeDto dto;
		list = new ArrayList<EmployeeDto>();
		psmt = conn.prepareStatement(All_SELECT);
		rs = psmt.executeQuery();
		while (rs.next()) {
			dto = new EmployeeDto();
			dto.setEmployee_id(rs.getInt("employee_id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setLast_name(rs.getString("last_name"));
			dto.setEmail(rs.getString("email"));
			dto.setPhone_number(rs.getString("phone_number"));
			dto.setHire_date(rs.getDate("hire_date"));
			dto.setJob_id(rs.getString("job_id"));
			dto.setSalary(rs.getInt("salary"));
			dto.setCommission_pct(rs.getFloat("commission_pct"));
			dto.setManager_id(rs.getInt("manager_id"));
			dto.setDepartment_id(rs.getInt("department_id"));
			list.add(dto);
		}
		return list;
	}

	@Override
	public EmployeeDto select() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(EmployeeDto dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EmployeeDto dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(EmployeeDto dto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
