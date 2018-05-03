
public class Demobean implements Child {

	private String message;
	
	// In case of Multiple arguments constructor
	
	private String userName , pwd;

	public Demobean(final String message) {
		this.message = message;

	}
	
	
	public Demobean(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}



	public void show() {
		System.out.println("Yogeshn :::" + message);
		
		System.out.println("username is" + userName + "password is" + pwd );
	}


	@Override
	public void getdata() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getnum() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getyun() {
		// TODO Auto-generated method stub
		
	}

	/*
	  When we have both setter injection and COnstructor Injection Constructor
	 	injection is overideen by Setter injection
	 */

}
