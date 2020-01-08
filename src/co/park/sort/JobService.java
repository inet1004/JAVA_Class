package co.park.sort;

import java.util.List;

import co.micol.dto.jobDto;

public interface JobService {
	public List<jobDto> selectAll() throws Exception; //전테테이블 목록
	public jobDto select(jobDto dto) throws Exception; //특정한 한레코드
	public int update(jobDto dto) throws Exception; //레코드갱신
	public int delete(jobDto dto) throws Exception; //레코드삭제
	public int insert(jobDto dto) throws Exception; //레코드추가
}
