package co.micol.prj.border.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.border.service.BorderMapper;
import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.service.BorderVO;
import co.micol.prj.comm.DataSource;

public class BorderServiceImpl implements BorderService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BorderMapper map = sqlSession.getMapper(BorderMapper.class); 
	
	@Override
	public List<BorderVO> borderSelectList() {

		return map.borderSelectList();
	}

	@Override
	public BorderVO borderSelect(BorderVO vo) {
		// TODO Auto-generated method stub
		return map.borderSelect(vo);
	}

	@Override
	public int borderInsert(BorderVO vo) {
		// TODO Auto-generated method stub
		return map.borderInsert(vo);
	}

	@Override
	public int borderUpdate(BorderVO vo) {
		// TODO Auto-generated method stub
		return map.borderUpdate(vo);
	}

	@Override
	public int borderDelete(BorderVO vo) {
		// TODO Auto-generated method stub
		return map.borderDelete(vo);
	}

	@Override
	public List<BorderVO> borderSelectSearchList(String key, String val) {
		// TODO Auto-generated method stub
		return map.borderSelectSearchList(key, val);
	}

	@Override
	public int borderUpdateHit(int id) {
		
		return map.borderUpdateHit(id);
	}

	@Override
	public List<BorderVO> borderSortList(String key) {

		return map.borderSortList(key);
	}

}
