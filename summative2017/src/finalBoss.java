
public class finalBoss {
	//final boss has 4 stages
	//1 - 2 normal combat encounters
	//2 - a drone fleet taking 1 damage/and hitting 
	//3 - Hit the shields
	//4 - DEATH STAR IT
	
	playerShip player; //player
	
	public finalBoss(playerShip x){
		player = x;//new old ship
	}//end constructor
	
	public void stageOne(){
		//1 combat encounter with big drones
		//another with bigger weapons
		
		stageTwo();
	}//end method
	
	public void stageTwo(){
		//array of drones, maybe at most 10-15 in waves, firing each once every 1-2 seconds
		
		stageThree();
	}//end method
	
	public void stageThree(){
		//shoot stuff at a shields
		//stage 4
		stageFour();
	}//end method
	
	public void stageFour(){
		//single button in middle of the screen
		//animation plays
		//game win
		
	}//end method
	
	

}//end class
