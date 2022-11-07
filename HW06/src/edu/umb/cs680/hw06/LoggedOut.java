package edu.umb.cs680.hw06;

public class LoggedOut implements State {
	private static LoggedOut instance = null;
	
	public static LoggedOut getInstance() {
		if(instance == null) {
			instance = new LoggedOut();
		}
		return instance;
	}
	
	public boolean authenticate(String pwd) {
		return true;
	}
	
	public void login(String pwd) {
		if(authenticate(pwd)) 
		{
		ctx.changeState(LoggedIn.getInstance());
		}
	}
	
	public void logout() {
		
	}

}
