import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

public class finalBoss {
	//final boss has 4 stages
	//1 - 2 normal combat encounters
	//2 - a drone fleet taking 1 damage/and hitting 
	//3 - Hit the shields
	//4 - DEATH STAR IT

	playerShip player; //player
	JLabel[] imageArr = new JLabel[20];//images
	JLabel[] shots = new JLabel[20];//shots label
	int[] c = new int[20];//temp variable for positioning and moving the drones at differing intervals

	public finalBoss(playerShip x){
		player = x;//new old ship

		for(int i = 0; i<imageArr.length; i++){
			//image icon init
			

		}//end for
		for(int i = 0; i<shots.length; i++){
			//init shots
		}//end for
		
		for(int i = 0; i<imageArr.length; i++){
			c[i] = (int)((Math.random()*100)+10);//random interval between 10 and 99
		}//end for
	}//end constructor

	public void stageOne(){
		//1 combat encounter with big drones
		//another with bigger weapons

		

		stageTwo();
	}//end method

	public void stageTwo(){
		//array of drones, maybe at most 10-15 in waves, firing each once every 1-2 seconds
		Timer moveS2 = new Timer(10, new ActionListener() {//open timer
			@Override
			public void actionPerformed(ActionEvent e) {//open listener
				//todo graphics


				//shoot a shot every 100 ticks



			}//end listener
		});//end timer
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

	}//end method/



}//end class
