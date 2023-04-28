package com.jsp.springbootUser.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootUser.dto.User;
import com.jsp.springbootUser.repository.UserRepo;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepo repo;
	
	
	public User saveUser(User user)
	{
	    return repo.save(user);
	}
	
	public User finduserbyid(int id)
	{
		User user = repo.findById(id).get();
		return user;
	}
	
	public User updateUser(int id, User user)
	{
		User user2 = repo.findById(id).get();
		if(user2!=null)
		{
			user.setId(id);
			return repo.save(user);
		}
		return null;
		
	}
	
	public User deleteUserByid(int id)
	{
		User user3 = repo.findById(id).get();
	     repo.delete(user3);
		return user3;
		
	}

}
