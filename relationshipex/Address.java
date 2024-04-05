package relationshipex;

public class Address {

	String addrLine,street,city,state;
	String pincode;
	
	public Address(){
		addrLine="manchar";
		street=" bharadi";
		city="Pune";
		state="Maharashtra";
		pincode="410412";
		
	}public Address(String addrLine, String street,String city,String state, String pincode){
		this.addrLine=addrLine;
		this.street=street;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		
	}public void display() {
		System.out.println(addrLine+" , "+street+" , "+city+" , "+state+" , "+pincode );
	}


}
