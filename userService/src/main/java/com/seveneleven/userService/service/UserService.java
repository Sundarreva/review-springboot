package com.seveneleven.userService.service;

import java.util.List;

import com.seveneleven.userService.exception.UserAlreadyExistException;
import com.seveneleven.userService.model.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User getUserById(long id);
	
	public User saveUser(User user) throws UserAlreadyExistException;
	
	public String deleteUserById(long id);

}
