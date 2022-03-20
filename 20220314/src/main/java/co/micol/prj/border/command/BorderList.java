package co.micol.prj.border.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.serviceImpl.BorderServiceImpl;
import co.micol.prj.comm.Command;

public class BorderList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		BorderService borderDao = new BorderServiceImpl();
		request.setAttribute("borders", borderDao.borderSelectList());
		
		return "border/borderList";
	}

}
