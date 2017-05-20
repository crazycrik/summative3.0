
public class beacon {
	private boolean completed = false; //if false even occurs
	private int rndID = 0;
	private int scrapReward = 0;
	
	public beacon(int eventID){
		rndID = eventID;
		
		if(rndID == 0){//nothing, normal event
			//todo
			//make enemy ship
		}else if(rndID == 1){
			//make enemy ship
		}else if(rndID == 2){
			//make enemy ship
		}else if(rndID == 3){
			//make enemy ship
		}else if(rndID == 4){
			//make enemy ship
		}
	}//end const
	
	public void normal(){
		
	}//end method
	public void superNova(){
		
	}//end method
	
	public void asFeild(){
		
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
