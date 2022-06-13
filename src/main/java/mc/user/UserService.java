package mc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
		
	public String register(UserVO userVO) {
		System.out.println("in service");
		userDAO.insert(userVO);
		return "";
	}
	
	
}
