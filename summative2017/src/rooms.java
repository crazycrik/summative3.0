import java.util.logging.Level;

public class rooms {
	private int roomID = 0; 
	private int roomLevel = 1;
	private boolean subSystem = false; //some variables 
	private int maxLevel = 0;
	private playerShip parentShip; 
	private int oxygenLevel = 100;
	private boolean powered = false;
	
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
	
	public void removeOxygen(){
		//to do graphics
		oxygenLevel -= 1; //drop oxygen by 1% each calling of the method
		//damage is handled outside
		//this will be called in a timer, so none is nessary here
	}//end method
	
	public boolean Destroy(){
		//todo graphics
		powered = false; //
		return powered;
	}//end method
	
	public int repair(){
		//it takes 5 seconds per level
		int timeTaken = 5 * roomLevel; 		
		return timeTaken; 
	}//end method
	
	public boolean poweredOn(){
		//todo graphics
		powered = true;//turn it on
		return powered;
	}//end method
	
	public boolean powerOff(){
		//todo diffrent graphics to destroy
		powered = false;//turn it off without destroying it
		return powered;
	}//end method

	public void sheilds(playerShip x, int systemPower){
		if(roomID == 5){
			if(systemPower == 0){
				//graphics
			}else if(systemPower == 1){
				//graphics
			}else if(systemPower == 2){
				//graphics
			}else if(systemPower == 3){
				//graphics
			}else if(systemPower == 4){
				//graphics
			}//end if
		}//end if
	}//end method
	
	public void checkIfCrewDying(crewMem x, boolean isInRoom){
		if(isInRoom == true && oxygenLevel < 20){ //if in room and no beathable air
			x.takeDamage(3);//per hit, will be called in timer
		}//end if
	}//end method
	
}//end class
