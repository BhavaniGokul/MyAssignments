package week3.day1.assignment;

public class DbConcrete extends DbconAbstract{

	public void disconnect() {
		System.out.println("Interface method disconnect");
		
	}

	public void downloadfile() {
	System.out.println("Abstract in concrete downloadfile");
		
	}
	public static void main(String[] args) {
		DbConcrete dbc=new DbConcrete();
		dbc.connect();
		dbc.disconnect();		
		dbc.executeUpdate();
		dbc.downloadfile();

	}

	

}
