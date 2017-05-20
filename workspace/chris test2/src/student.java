
public class student {
	int studentNum;
	String fName;
	String lName;
	boolean feePaid;
	int phoneNum;
	int dateOBirth;
	String address;
	
	String[] clubs = new String[100];
	
	
	public student(int sNum, String firstName, String lastName, boolean fPay, int phNum, int dob, String addr) {
		//<Variables>
		studentNum = sNum;
		fName = firstName;
		lName = lastName;
		feePaid = fPay; //I DECLARE... VARIABLES!!!!!
		phoneNum = phNum;
		dateOBirth = dob;
		address = addr;
		//</Variables>
	
	}

	public void joinClub(String[] x, club y){
		for(int z = 0; z<x.length; z++){
			if(x[z] == null){
				x[z] = y.getName();
				break;
			}else{
				continue;
			}//end if
		}//end for
	}//end method
	
	public void leaveClub(String[] x, club y){ //leaves the club by taking it out of the array; 
		for(int z = 0; z<x.length; z++){
			if(x[z] == y.getName()){
				x[z] = null;
				break;//don't want to fill the whole array, then not be able to change anything. 
			}else{
				continue;//continue
			}//end if
		}//end for	
	}//end method
	
}//end class
