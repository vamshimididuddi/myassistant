package com.vamshimididuddi.myassistant.services;

import org.springframework.stereotype.Service;

import com.vamshimididuddi.myassistant.entities.Friend;

@Service
public class FriendService {

	public boolean isValid(Friend friend) {
		String name = friend.getName();   
		if(!friend.getEmailid().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$ "))
		{
			return false;
		}
		if(!String.valueOf(friend.getTel()).matches("/[2-9]{2}\\d{8}/"))
		{
			return false;
		}                                      
		if(name != null && name.matches("^[\\p{L} .'-]+$"))
		{
			return false;
		}
		return true;
	}
}
