package com.lizewu.java;

public class HelloWorld {
	
	private String username;
	private String password;
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String userName)
	{
		this.username=userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String pwd)
	{
		this.password=pwd;
	}
	
	public HelloWorld()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Hello Java");
		System.out.println("Hello World");
		System.out.println("Hello Java");
		HelloWorld hello=new HelloWorld();
		hello.setUsername("admin");
		hello.setPassword("1234567");
		System.out.println("用户名是:"+hello.getUsername());
		System.out.println("密码是:"+hello.getPassword());
	}

}
