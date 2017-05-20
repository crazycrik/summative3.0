
public class club {
	public String name = "club1";
	public String teachName;
	public int meetingDay;
	public boolean simester;
	boolean feePaid;
	
	public club(String cName, String tName, int meetDay, boolean simes, boolean fPay){
		name = cName;
		teachName = tName;
		meetingDay = meetDay; //all the decelerations 
		simester = simes;
		feePaid = fPay;
		
	}//end constructor
	
	public boolean payFee(){
		return true; //I have no way to take money from your credit card. Put that on the next assignment
	}//end method
	public String getName(){
		return name;
	}
}
