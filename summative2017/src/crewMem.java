
public class crewMem {
	private int crewHP; //they can fight other crew
	private int crewType = 0; //species of the crew
	private int pilotSk = 0;
	private int engSk = 0; 
	private int shieldSk = 0; //crew has specific skill levels for diffrent rooms around the ship
	private int repSk = 0;
	private int combatSk = 0;
	private int maximHP = 0;
	private String crewName = "";

	private double damageTakenMP = 1;
	private double damageDealtMP = 1;



	public crewMem(int maxHP, int type, int maxBaseSkills, String name){//open constructor

		int[] temp1 = new int[5];//new temp array for the skills
		for(int i = 0; i<temp1.length; i++){//open for
			temp1[i] = (int)(Math.random()*(maxBaseSkills+1));//random values for the base skills
		}//end for

		pilotSk = temp1[0]; //sets the random skill level
		engSk = temp1[1];	//still allows for additions and subractions
		shieldSk = temp1[2];
		repSk = temp1[3];
		combatSk = temp1[4];

		crewName = name; //constructors
		crewType = type;
		crewHP = maxHP;
		maximHP = maxHP;

		if(type == 0){
			System.out.println(name + " is a human");
			//nothing happens, humans are base species. this will also be for graphics

		}else if(type == 1){
			System.out.println(name + " is an Enji");
			//change graphic here
			repSk += 3;
			damageTakenMP = 1.2;
			damageDealtMP = 0.8;
		}else if(type == 2){
			System.out.println(name + " is a mantis");
			//change graphic here
			repSk /= 2;//mantis are bad at repair but very good in combat
			combatSk += 1;//adds one to combat skill
			damageTakenMP = .9;//sligtly better in fightss
			damageDealtMP = 1.5;//way better in fights
		}else if(type == 3){
			System.out.println(name + " is a Rock");//debug
			//change graphic here
			//rocks are immune to fire and do not need oxygen, they have no other stats gained except more health and less damage
			crewHP = (int)(crewHP * 1.5);
			damageDealtMP /= 2;// multipliers and changes skills
			damageTakenMP *= .8;
		}//end if	
	}//new crew


	public void takeDamage(int damage){//open method
		crewHP -= (int)(damage*damageTakenMP);//do damage
		if(crewHP <=0){//if 0 or less than 0
			System.out.println(crewName + " is dead");//U ded
		}//end if
	}//end method

	public void doDamage(crewMem enemy){//open method
		int d = (int)(combatSk * damageDealtMP);//do extra damage
		enemy.takeDamage(d);//do damage to enemy
	}//end method

	public void onFire(){
		if(crewType != 3){
			takeDamage(1);//fire damage. in almost all cases the (int)(1*damage taken mp) will come out to 1, rocks don't take fire damage
		}//end if

	}//end method

	public void heal(int healAm){
		crewHP+=healAm;//heal
		if(crewHP > maximHP){
			crewHP = maximHP;
		}//can't go over max
	}//end method
	
	
}//end class
