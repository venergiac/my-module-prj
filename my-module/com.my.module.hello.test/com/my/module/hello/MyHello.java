package com.my.module.hello;

import java.util.ServiceLoader;

import com.my.module.hello.api.IMyHello;

public class MyHello {

	public static void main(String[] args) {
		System.out.println("start");
		ServiceLoader<IMyHello> hello = ServiceLoader.load(IMyHello.class);
		
		for (IMyHello iMyHello : hello) {
			System.out.println(iMyHello);
		}
		
		hello.stream()
		.map(a -> a.get().hello("Mike"))
		.forEach(a-> System.out.println("\t"+a));
	}
}
