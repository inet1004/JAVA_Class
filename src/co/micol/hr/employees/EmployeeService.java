package co.micol.hr.employees;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
	public List<?> allSelect() throws SQLException;
	public EmployeeDto select() throws SQLException;
	public int insert(EmployeeDto dto) throws SQLException;
	public int update(EmployeeDto dto) throws SQLException;
	public int delete(EmployeeDto dto) throws SQLException;
	
}
