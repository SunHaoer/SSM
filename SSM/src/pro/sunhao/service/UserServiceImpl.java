package pro.sunhao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.sunhao.mapper.UserMapper;
import pro.sunhao.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;	

	@Override
	public List<User> findUserAll() {
		return userMapper.findUserAll();
	}

}
