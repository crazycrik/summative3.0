
public class rooms {
	private int roomID = 0;
	private int roomLevel = 1;
	private boolean subSystem = false;
	private int maxLevel = 0;
	private playerShip parentShip; 
	
	public rooms(int id, int level, boolean sub, playerShip pSh){
		roomID = id;
		roomLevel = level;		//constructors
		subSystem = sub;
		parentShip = pSh;
		initRoom(id);//make the room
		
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
	
	
	
	
}//end class
