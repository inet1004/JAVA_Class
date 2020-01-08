package co.micol.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.park.sort.DAO;
import co.park.sort.JobService;

public class JobServiceImpl extends DAO implements JobService {
	private PreparedStatement psmt;
	private ResultSet rs;
	private List<jobDto> list;
	private jobDto dto;

	private final String ALL_JOBS = "select * from jobs";

	@Override
	public List<jobDto> selectAll() throws Exception {
		list = new ArrayList<jobDto>();
		psmt = conn.prepareStatement(ALL_JOBS);
		rs=psmt.executeQuery();
		while(rs.next()) {
			dto=new jobDto();
			dto.setJob_id(rs.getString("job_id"));
			dto.setJob_title(rs.getString("job_title"));
			dto.setMax_salary(rs.getInt("max_salary"));
			dto.setMin_salary(rs.getInt("min_salary"));
			list.add(dto);
		}
		return list;
	}

	@Override
	public jobDto select(jobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(jobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(jobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(jobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
