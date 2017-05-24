import javax.swing.*;

public class beacon {
	private boolean completed = false; //if false even occurs
	private int rndID = 0;//the id of the event, 0-4
	private int scrapReward = 0;//
	private playerShip enShip = new playerShip(10000, 10000, 10000);//new enemy ship, has effectiavly infinite ammo and doesn't need to jump more than once

	public beacon(int eventID){
		rndID = eventID;

		if(rndID == 0){

		}else if(rndID == 1){

		}else if(rndID == 2){

		}else if(rndID == 3){

		}else if(rndID == 4){

		}
	}//end const

	public void normal(){
		//nothing happens
	}//end method
	public static void shop(playerShip x){
		int dialogResult = JOptionPane.showConfirmDialog (null, "Would you like to heal to full and spend all your scrap?, this option will only show once per beacon");//show the message box
		if(dialogResult == JOptionPane.YES_OPTION){
			System.out.println("yes");//if its yes, debug code
			x.heal(30);//heal to max health
			//when this is called from mainGUI it will have the scrap depleted
		}else{
			System.out.println("no");//debug code
			//nothing else happens
		}


	}//end method

	public void asFeild(playerShip x){
		x.getHit(1, x);//hits the player for 1 damage
	}//end method

	public boolean questStart(int reward){//lets get some quests
		scrapReward = reward;//sets the reward for completing the quest		
		return true;//gives a quest
	}//end method

	public int questComp(boolean qStarted){//check if there is an on-going quest
		if(qStarted == true){
			return scrapReward;//reward
		}else{
			return 0;//no reward from no quest
		}//end if
	}//end method

}//end class
