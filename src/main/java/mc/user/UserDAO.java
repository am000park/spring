package mc.user;

import org.springframework.stereotype.Repository;

import mc.service.impl.AbstractDAO;

@Repository("UserDAO")
public class UserDAO extends AbstractDAO {
		
	public String insert(UserVO userVO) {
		System.out.println("in dao");
		return "";
	}
}
