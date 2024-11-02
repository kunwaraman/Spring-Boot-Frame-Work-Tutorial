package com.aman.company;

import org.springframework.stereotype.Component;

@Component
public class Dog { // yha se ye dog ka object ban jayega ioc main container lagane se
	public String fun() {
		return "something";
	}

}
