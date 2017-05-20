/*
 Chris Puglisi
 Mr. Boutanous
 v1.0
 Extending Robots
*/

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class extendingRobots extends Robot{
	public extendingRobots(City arg0, int arg1, int arg2, Direction arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public static void main(String[] args) {


	}
	public void turnRight(Robot z){
		z.turnLeft();
		z.turnLeft();
		z.turnLeft();
	}//end method
	public void turnAround(Robot z){
		z.turnLeft();
		z.turnLeft();
	}//end method
	public void move(Robot z, int x){
		for(int y = 0; y<x; y++){
			z.move();
		}//end for
	}//end method
	public void moveBack(Robot z, int x){
		turnAround(z);
		for(int y = 0; y<x; y++){
			z.move();
		}//end for
	}//end method
	public void pickRow(Robot z){
		while(z.frontIsClear() == true){
			if(z.canPickThing() == true){
				z.pickThing();
			}//end if
			move(z, 1);
		}//end while
	}//end method
	public void placeRow(Robot z){
		while(z.frontIsClear() == true){
			z.putThing();
		}//end while
		move(z, 1);
	}//end method
	public void pickGrid(Robot z, int xValue, int yValue, boolean[][] grid){
		turnRight(z);
		int y = 0;
		for(int x = 0; x<yValue/2+1; x++){ //enough iterations for the robot to clear grid at 2 changes per time, odd number for the +1
			while (z.frontIsClear() == true) {
				if(z.canPickThing() == true){
					z.pickThing();
					grid[y][x] = true; //x and y are switched becuase of poor planning on my part, ignore pls
				}//end if
				move(z, 1);//moves the robot
				y++;//adds one to y
			}//end while
			y=0;
			turnRight(z); 
			move(z,1);
			turnRight(z);

			while (z.frontIsClear() == true) {

				if(z.canPickThing() == true){
					z.pickThing();
					grid[y][x] = true;
				}
				move(z, 1);
				y++;
			}
			y=0;
			z.turnLeft();
			move(z,1);
			z.turnLeft();
		}
	}
	public void putGrid(Robot z, int xValue, int yValue, boolean[][] grid){
		while (z.frontIsClear() == true) {
			move(z, 1);// moving
		} // end while
		z.turnLeft(); // 90 turn
		z.turnLeft();// 180 turn
		while (z.frontIsClear() == true) {
			move(z, 1);// moving
		} // end while

		z.turnLeft();// 90 turn to measure the next

		while (z.frontIsClear() == true) {
			move(z, 1);// moves it once toward a max or min
		} // end while

		z.turnLeft();// 90 turn
		z.turnLeft();// 180 turn

		while (z.frontIsClear() == true) {
			move(z, 1);// moving
		} // end while
		turnRight(z);	//moves the robot to the top left corner and faces it to the right



		for(int a = 0; a<grid.length; a++){
			move(z, 1);
			for(int b = 0; b<grid[a].length; b++){
				if(grid[a][b] == true){
					z.putThing();
				}
			}
		}


	}
	public int getRobotSpeed(Robot z){
		int x =	(int) (z.getSpeed());
		return x;
	}
	public void setRobotSpeed(Robot z, int x){
		z.setSpeed(x);
	}
	public void increaseRobotSpeed(Robot z, int x){
		x = getRobotSpeed(z);
		for(int y = 0; y<5; y++){
			z.turnLeft();
			turnRight(z);
			setRobotSpeed(z, (x +2));
		}
	}
}//end class


