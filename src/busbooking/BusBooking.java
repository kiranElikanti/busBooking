package busbooking;

public class BusBooking {
	String customername;
	int  customerId;
	String emailId;
	int phoneNumber;
	public BusBooking(String customername, int customerId, String emailId, int phoneNumber) {
		super();
		this.customername = customername;
		this.customerId = customerId;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	 public String  bookTicket(String departureStation,String arrivalTime) {
	  return "bookTicket:"+departureStation+"arrivalStation"; 
	  
}
	          public int charge(int charge,int tax) {
	    int totalCharge=charge-tax;
	    return totalCharge;
	          
}



	@Override
	public String toString() {
		return "BusBooking [customername=" + customername + ", customerId=" + customerId + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}
