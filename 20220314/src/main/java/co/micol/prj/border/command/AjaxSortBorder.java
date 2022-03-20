package co.micol.prj.border.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.service.BorderVO;
import co.micol.prj.border.serviceImpl.BorderServiceImpl;
import co.micol.prj.comm.Command;

public class AjaxSortBorder implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		BorderService borderDao = new BorderServiceImpl();
		

		String key = request.getParameter("key");
				
		List<BorderVO> list = borderDao.borderSortList(key);
		String data = null;
		try {
			data = new ObjectMapper().writeValueAsString(list);  //json 객체로 변환 한다.
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println(data.toString());
		return "ajax:"+data;

	}

}
