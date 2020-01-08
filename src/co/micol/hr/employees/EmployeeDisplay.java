package co.micol.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDisplay {
	List<EmployeeDto> list;

	public void allSelectList() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		list = new ArrayList<EmployeeDto>();
		try {
			list = emp.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (EmployeeDto dto : list)
			dto.toString();
	}

	public void employeeInsert() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Date date=Date.valueOf("2020-01-01");  //날자 생성
		dto.setEmployee_id(222);
		dto.setFirst_name("승리");
		dto.setLast_name("박");
		dto.setEmail("park");
		dto.setHire_date(date); //날자값
		dto.setJob_id("AD_PRES");
		dto.setPhone_number("010.2222.2222");
		dto.setSalary(150000);
		dto.setCommission_pct(0);
		dto.setManager_id(100);
		dto.setDepartment_id(60);

		try {
			int n = emp.insert(dto);
			if (n != 0)
				System.out.println("성");
			else
				System.out.println("실");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
