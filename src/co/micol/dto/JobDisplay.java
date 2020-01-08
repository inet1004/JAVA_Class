package co.micol.dto;

import java.util.ArrayList;
import java.util.List;

import co.park.sort.JobService;

public class JobDisplay {
//	JobServiceImpl job; //추후spring frame work사용시 interface객체를 호출사용함
	private List<jobDto> list;
	
	public void allSelectDisplay() { //전체리스트를 보여주는 메소드
		JobServiceImpl jobs=new JobServiceImpl();
		list =new ArrayList<jobDto>();
		try {
			list=jobs.selectAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(jobDto dto:list) {
			System.out.print(dto.getJob_id()+"|");
			System.out.print(dto.getJob_title()+"|");
			System.out.print(dto.getMax_salary()+"|");
			System.out.println(dto.getMin_salary()+"|");
		}
	}
}
