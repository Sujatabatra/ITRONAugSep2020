package com.sujata.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private static Map<String,String> users=new HashMap<>();
	
	static{
		users.put("sujata","batra");
		users.put("satyam", "mishra");
		users.put("sarthak", "khurana");
		users.put("dhanush", "chandra");
	}
	
	@Override
	public String getPassword(String username) {
		
		return users.get(username);
	}

}
