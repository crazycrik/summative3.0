import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/*
 STILL TO DO                          100% needed?
 - actual graphics						yes
 - timer/animations						yes
 - rooms in ships						yes
 - shops								yes
 - more loss conditions					no
 - final boss/win conditions			yes
 - oxygen % kills						yes
 - room oxygen							yes
 - fire damage to crew					yes
 - piolt/engine/evade interaction		yes
 
 */



public class mainGUI {


	int scrap = 30;
	int fuel = 15;
	int missles = 15;		//gameplay variables
	int droneParts = 0;
	int oxygen = 100;
	int evade = 0;


	playerShip player = new playerShip(fuel, missles, droneParts);
	static beacon[] sector0 = new beacon[30];   //game objects



	static JFrame frame = new JFrame("FTL");
	static JLabel label1 = new JLabel("I'm a label"); //GUI objects


	//GUI varaibles?

	public static void main(String[] args){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//as opposed to JFrame.CRASH_ON_CLOSE
		frame.setSize(1280, 720); //720p
		frame.setVisible(true);//shows frame`
		frame.setLayout(null);//let me control pls


		label1.setEnabled(true);
		label1.setBounds(10, 10, 65, 20);
		label1.setVisible(true);
		label1.setOpaque(true);
		label1.setToolTipText("showing");
		frame.add(label1);

		
		sector0 = proceduralGen(30, sector0);//init sector0, difrent every game
		for(int i = 0; i<sector0.length; i++){
			System.out.println(sector0.length);
			if(sector0[i] != null){
				System.out.println("sector0[" + i + "] is not null");//
			}else{
				System.out.println("null");//if its null, idk its debug code
			}//end if
		}//debug to make sure that I don't get null pointer exceptions

	}//end main

	public static beacon[] proceduralGen(int x, beacon[] be){
		if(x == 0){//if over
			int y = (int)(Math.random()*5);//random number
			be[x] = new beacon(y);//random num generated beacon
			return be;//end the entire thing
		}else{
			int y = (int)(Math.random()*5);//random number
			be[x-1] = new beacon(y);//random num generated beacon
			return proceduralGen(x-1, be);//recursavly generate the beacons
		}//end if
	}//end method




}//end class
