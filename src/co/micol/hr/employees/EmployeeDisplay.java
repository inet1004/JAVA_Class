package co.micol.hr.employees;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDisplay {
	List<EmployeeDto> list;
	
	public void allSelectList() {
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		list=new ArrayList<EmployeeDto>();
		try {
			list=emp.allSelect();
		}catch(SQLException e){
			e.printStackTrace();
		}
		for(EmployeeDto dto:list)
			dto.toString();
	}
	
}
