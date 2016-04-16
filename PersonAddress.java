/*
 * PersonAddress.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 */


public class PersonAddress {
	
	private String name;
	private String address;
	private String email;
	private String phoneNumber;
	
	public void setAttributes(String newName, String newAddress, 
	String newEmail, String newPhoneNumber) {
		name = newName;
		address = newAddress;
		email = newEmail;
		phoneNumber = newPhoneNumber;
		}
		
	public String getName(){
		return name;
		}
	public String getAddress(){
		return address;
		}
	public String getEmail(){
		return email;
		}	
	public String getPhoneNumber(){
		return phoneNumber;
		}

	public void setEmail(String changeEmail){
		email = changeEmail;
		}
	public void setNumber(String changeNumber){
		phoneNumber = changeNumber;
		}
	public boolean equal (PersonAddress x){
		return name.equals(x.name);
		}	
		
	public boolean areEqual(PersonAddress x){
		return equals(x);
		}	
	
	public boolean equals(PersonAddress otherPerson){
		return (this.name.equals(otherPerson.name)) &&
			   (this.address.equals(otherPerson.address)) &&
			   (this.email.equals(otherPerson.email)) &&
			   (this.phoneNumber.equals(otherPerson.phoneNumber));
		}
		
	public static void main (String args[]) {
		
		PersonAddress Graf = new PersonAddress();
		PersonAddress graf = new PersonAddress();
		graf.setAttributes("Charles DeGrapharee Exum", 
		"214 Smeaglewood Port, Ethins GA, 31606", "wonky@britches.com",
		"123-456-7890");
		Graf.setAttributes("Charles DeGrapharee Exum", 
		"214 Smeaglewood Port, Ethins GA, 31606", "wonky@britches.com",
		"123-456-7890");
		System.out.println(graf.equals(Graf));
		Graf.setNumber("122-333-4444");
		System.out.println(graf.equals(Graf));
				
	}
}

