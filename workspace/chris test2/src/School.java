
public class School {

	public static void main(String[] args) {
		student chris = new student(827134, "Chris", "Puglisi", false, 999999999, 11241999, "whereILive");//no personal info, anyway here's my SIN 
		club programmingClub = new club("Programming Club", "Teacher", 3, false, false); //lets have one
		chris.joinClub(chris.clubs, programmingClub);//I am now in the programming club
		chris.feePaid = programmingClub.payFee(); //I pay $$
		programmingClub.feePaid = true;
		
		if(programmingClub.simester == false){
			System.out.println("We meet in the first Simester");
		}else{
			System.out.println("we meet second simester");
		}
		
		
	}//end main
}
