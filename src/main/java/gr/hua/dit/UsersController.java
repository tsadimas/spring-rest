package gr.hua.dit;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.dao.UserDAO;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;
	
	
	@Autowired
	UserService objServices;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public UserService users(){
		 List<User> users =  userDAO.getAll();
		 this.objServices.setUserList(users);


		 return this.objServices;
	}
	
	
	@RequestMapping(value = "user/{userId:\\d+}", method = RequestMethod.GET)
	public User getuser(@PathVariable("userId") int userId){
		 User user =  userDAO.getById(userId);
		 return user;
	}
}
