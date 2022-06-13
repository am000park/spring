package mc.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "member/login";
	}
	
	@RequestMapping(value = "/loginChk", method = RequestMethod.POST)
	public String loginChk(HttpServletRequest request, Model Model) {
		String userId = request.getParameter("userId");
		
		System.out.println(request.getParameter("userId"));
		return "";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(HttpServletRequest request, Model Model) {
		return "member/signup";
	}
	
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public String register(UserVO userVO, HttpServletRequest request, Model Model) {
		
		userService.register(userVO);
				
		return "";
	}
	
}
