package mc.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "member/login";
	}
	
	@RequestMapping(value = "/member/loginChk", method = RequestMethod.POST)
	public String loginChk(HttpServletRequest request, Model Model) {
		String userId = request.getParameter("userId");
		
		System.out.println(request.getParameter("userId"));
		return "";
	}
	
	@RequestMapping(value = "/member/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, Model Model) {
		return "member/signup";
	}
	
}
