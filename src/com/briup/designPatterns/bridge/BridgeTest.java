package com.briup.designPatterns.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		
		DriverManager driver1 = new DriverManager(new MySQLDriver());
		DriverManager driver2 = new DriverManager(new OracleDriver());
		driver1.getConnection();
		driver2.getConnection();
		
	}
}
interface Driver{
	public void getDriver();
}
class MySQLDriver implements Driver{
	
	@Override
	public void getDriver() {
		System.out.println("i am MySQLDriver");
	}
	
}
class OracleDriver implements Driver{

	@Override
	public void getDriver() {
		// TODO Auto-generated method stub
		System.out.println("i am Oracle Driver");
	}
	
}
//abstract manager bridge
abstract class Manager {
	private Driver driver;
	public void getConnection(){
		driver.getDriver();;
	}
	public void setConnection(Driver driver){
		this.driver = driver;
	}
}
//implement bridge
class DriverManager extends Manager{
	public DriverManager (Driver driver){
		setConnection(driver);
	}
	public void getConnection(){
		super.getConnection();
	}
}