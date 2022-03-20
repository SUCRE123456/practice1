package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리 과정
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId("abc@naver.com");
		vo.setPassword("111");
		vo= memberDao.selectMember(vo);
		if(vo != null) {
			//여기서 세션 처리하고
			request.setAttribute("message", vo.getName() + " 님 환영합니다.");
		}else {
			request.setAttribute("message", "아이디 또는 패스워드가 틀립니다.");
		}
				
		return "member/memberLogin";
	}

}
