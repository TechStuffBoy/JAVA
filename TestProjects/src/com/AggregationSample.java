package com;

public class AggregationSample {

	int id;
	String name;
	Address address;
	
	public AggregationSample(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " +  address.country );
	}
	
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		
		AggregationSample e1 = new AggregationSample(123, "nandhu", address1);
		AggregationSample e2 = new AggregationSample(124, "ram", address2);
		
		e1.display();
		e2.display();
	}
	

}
