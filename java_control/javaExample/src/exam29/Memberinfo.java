package exam29;

public class Memberinfo {
private	String id;
private	String ps;
private	String name;
private	String phone;
private	String adress;



public Memberinfo(String id, String ps, String name, String phone, String adress) {
	super();
	this.id = id;
	this.ps = ps;
	this.name = name;
	this.phone = phone;
	this.adress = adress;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPs() {
	return ps;
}
public void setPs(String ps) {
	this.ps = ps;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}




}
