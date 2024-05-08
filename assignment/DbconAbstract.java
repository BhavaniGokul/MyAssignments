package week3.day1.assignment;

public abstract class DbconAbstract implements DatabaseConnection {

	public void connect() {
		System.out.println("Interface method connect");
		
	}
	public void executeUpdate() {
		System.out.println("Interface method executeUpdate");
		
	}
	public abstract void downloadfile();

	
	}
