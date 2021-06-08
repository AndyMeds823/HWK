
public class Customer {
String userName;
int connectionId;
String type;
int planType;

public Customer(String userName, int connectionId,String type,int planType ) {
	this.userName= userName;
	this.connectionId= connectionId;
	this.type=type;
	this.planType= planType;
}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName=userName;
	}
	public int getconnectionId() {
		return connectionId;
	}
	public void setconnectionId(int connectionId) {
		this.connectionId= connectionId;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	public int getplanType() {
		return planType;
	}
	public void setplanType(int planType) {
		this.planType= planType;
	}
}
