package pro.sunhao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pro.sunhao.pojo.User;
import pro.sunhao.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/findUserList")
	public String findUserList(Model model) {
		List<User> list = userService.findUserAll();
		model.addAttribute("userList", list);
		return "userList";
	}
	
}
