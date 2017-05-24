import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class playerShip {
	private int health = 30;
	private int fuel = 0;
	private int missles = 0;
	private int drones = 0;



	public playerShip(int startFuel, int startMissle, int startDrones){
		fuel = startFuel;
		missles = startMissle;		//starting the ship with drone parts, fuel and missles
		drones = startDrones;
	}//end constructor

	public void die(playerShip x){
		//to do  - kill
			
			
		//to do - animation
	}//kill it

	public void heal(int healAm){
		health+= healAm;//heals the ship
		if(health > 30){
			health = 30;//no HP over 30
		}//end if
	}//end method

	public void shoot(playerShip x, boolean isMissleWeapon, int damage){
		if(isMissleWeapon == true){
			missles -= 1;//consume a missle
			x.getHit(damage, x);//hit the other ship
			//to do - play animation
		}else{
			x.getHit(damage, x);//hit the other ship
			//to do - play animation
		}
		
		
	}//end shoot

	public int getHit(int damage, playerShip x){
		health-=damage;//Subtract health
		if(health <=0){//check for health
			this.die(x); //if 0 health, die
		}//end if

		return health;
	}//end method
}//end class
