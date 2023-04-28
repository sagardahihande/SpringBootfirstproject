package com.jsp.springbootUser.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootUser.dao.UserDao;
import com.jsp.springbootUser.dto.User;

@RestController
public class UserControllor {
	@Autowired
	UserDao dao;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return dao.saveUser(user);
	}
	
	@GetMapping("/get")
	public User finduserbyid(@RequestParam int id)
	{
		return dao.finduserbyid(id);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestParam int id, @RequestBody User user)
	{
		 return  dao.updateUser(id, user);
	}
	
	@DeleteMapping("/delete")
	public User deleteUser(@RequestParam int id)
	{
		return dao.deleteUserByid(id);
	}

}
