
public class playerShip {
	private int health = 30;
	
	public playerShip(){
		
	}
	
	public void die(){
		
	}
	
	public void heal(int healAm){
		health+= healAm;//heals the ship
	}//end method
	
	public void shoot(){
		
	}
	
	public int getHit(int damage){
		health-=damage;//Subtract health
		if(health <=0){//check for health
			this.die(); //if 0 health, die
		}//end if
		
		return health;
	}//end method
	
	
	
}//end class
