public class Employee{
	private String name;
	private double hours;
	private double rate;
	private Address[] address;
	public Employee (String name, double hours, double rate, Address[] address){
		this.name=name;
		this.hours=hours;
		this.rate=rate;
		this.address=address;
	}
}