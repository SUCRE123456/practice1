package co.micol.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.comm.DataSource;
import co.micol.prj.member.service.MemberMapper;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> selectMemberList() {
		// 전체회원 목록
		return map.selectMemberList();
	}

	@Override
	public MemberVO selectMember(MemberVO vo) {
		//한명 또는 로그인
		return map.selectMember(vo);
	}

	@Override
	public int insertMember(MemberVO vo) {
		//회원등록
		return map.insertMember(vo);
	}

	@Override
	public int updateMember(MemberVO vo) {
		//회원변경
		return map.updateMember(vo);
	}

	@Override
	public int deleteMember(MemberVO vo) {
		//회원삭제
		return map.deleteMember(vo);
	}

	@Override
	public boolean isIdCheck(String str) {
		//아이디 중복체크
		return map.isIdCheck(str);
	}

}
