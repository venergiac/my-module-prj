package com.my.module.hello.it;

import java.text.MessageFormat;

import com.my.module.hello.api.IMyHello;

public class MyITHello implements IMyHello{

	@Override
	public String hello(String name) {
		return MessageFormat.format(
			     "Ciao {0}",
			     name);
	}

	
	public static MyITHello provider() {
		System.out.println("MyITHello called");
		return new MyITHello();
	}
}
