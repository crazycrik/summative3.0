
public class rooms {
	private int roomID = 0; 
	private int roomLevel = 1;
	private boolean subSystem = false; //some variables 
	private int maxLevel = 0;
	private playerShip parentShip; 
	private int oxygenLevel = 100;
	
	public rooms(int id, int level, boolean sub, playerShip pSh){
		roomID = id;
		roomLevel = level;		//constructors
		subSystem = sub;
		parentShip = pSh;
		initRoom(id);//make the room
		//github test
	}//end const

	public void initRoom(int rmId){
		// options are - pilot, engines, oxygen, weapons, shields, medbay and empty

		if(rmId == 0){
			//room is empty, do nothing
			//todo - graphics - empty room
			maxLevel = 0;
		}else if(rmId == 1){
			//room is pilot
			//todo - graphocs - pilot bay
			maxLevel = 5;    
		}else if(rmId == 2){
			//room is engines
			//todo - graphics - engine room
			maxLevel = 8;
		}else if(rmId == 3){
			//room is oxygen
			maxLevel = 3;
		}else if(rmId == 4){
			//room is weapons
			maxLevel = 4;
		}else if(rmId == 5){
			//room is shields
			maxLevel = 4;
		}else if(rmId == 6){
			//room is medbay
			maxLevel = 3;
		}//end if	
	}//end method

	public void healCrew(crewMem x){
		int i = 10 + (roomLevel * 5); //max of 10 + (3*5) which is 25/second in game because of timer
		if(roomID == 6){//remember if medbay
			x.heal(i);//heals the crew member in it
		}//end if
	}//end method
	
	
	

}//end class
