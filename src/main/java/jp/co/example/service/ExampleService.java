package jp.co.example.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	private String user;

	public void create() {
		System.out.println(user);
		return;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
