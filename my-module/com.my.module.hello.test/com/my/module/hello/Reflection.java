package com.my.module.hello;

public class Reflection {

	
	public static void main(String[] args) {
		
		System.out.println("Module: " + MyHello.class.getModule().getDescriptor());
		
		System.out.println("\nList: ");
		MyHello.class.getModule().getPackages().forEach(System.out::println);
		
		System.out.println("\nLayers: ");
		MyHello.class.getModule().getLayer().parents().forEach(System.out::println);

		
		
		System.out.println("\nUses: ");
		MyHello.class.getModule().getDescriptor().uses().forEach(System.out::println);
		
		System.out.println("\nOpens: ");
		MyHello.class.getModule().getDescriptor().opens().forEach(System.out::println);
	}
	
}
