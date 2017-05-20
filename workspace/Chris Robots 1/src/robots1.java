import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * Chris Puglisi March 7th v1.0
 */
public class robots1 {
	static int xValue;
	static int yValue;
	static int[] temp;
	static boolean[][] grid;
	static int amountOfThingsInBackpack = 0;
	public static void main(String[] args) {
		xValue = 0;
		yValue = 0;
		temp = new int[2];
		City newmarket = new City();
		buildWalls2(newmarket);
		buildThings(newmarket);
		Robot karel = new Robot(newmarket, 4, 2, Direction.EAST);

		findGrid(karel, temp); // ALL THIS TO MAKE AN ARRAY
		xValue = temp[0]; // makes an array
		yValue = temp[1]; // array y
		grid = new boolean[xValue][yValue]; // Declaration of an
		// array

		// now to initalize

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = false;
			}
		}
		System.out.println(xValue);
		System.out.println(yValue);

		clearGrid(karel);
		amountOfThingsInBackpack = karel.countThingsInBackpack();
		putThemBack(karel);
		printToFile(grid);
	} // end main

	public static void buildWalls(City newmarket) { // Make America Great Again
		Wall blockAve1n = new Wall(newmarket, 3, 2, Direction.NORTH);
		Wall blockAve2n = new Wall(newmarket, 3, 3, Direction.NORTH);
		Wall blockAve3n = new Wall(newmarket, 3, 4, Direction.NORTH);
		Wall blockAve4n = new Wall(newmarket, 3, 5, Direction.NORTH);
		Wall blockAve5n = new Wall(newmarket, 3, 6, Direction.NORTH);
		Wall blockAve6n = new Wall(newmarket, 3, 7, Direction.NORTH);
		Wall blockAve7n = new Wall(newmarket, 3, 8, Direction.NORTH);
		//
		Wall blockAve1s = new Wall(newmarket, 10, 3, Direction.SOUTH);
		Wall blockAve2s = new Wall(newmarket, 10, 4, Direction.SOUTH);
		Wall blockAve8s = new Wall(newmarket, 10, 5, Direction.SOUTH);
		Wall blockAve3s = new Wall(newmarket, 10, 6, Direction.SOUTH);
		Wall blockAve4s = new Wall(newmarket, 10, 7, Direction.SOUTH);
		Wall blockAve5s = new Wall(newmarket, 10, 8, Direction.SOUTH);
		Wall blockAve7s = new Wall(newmarket, 10, 2, Direction.SOUTH);

		Wall blockAve1e = new Wall(newmarket, 3, 8, Direction.EAST);
		Wall blockAve2e = new Wall(newmarket, 4, 8, Direction.EAST);
		Wall blockAve3e = new Wall(newmarket, 5, 8, Direction.EAST);
		Wall blockAve4e = new Wall(newmarket, 6, 8, Direction.EAST);
		Wall blockAve5e = new Wall(newmarket, 7, 8, Direction.EAST);
		Wall blockAve6e = new Wall(newmarket, 8, 8, Direction.EAST);
		Wall blockAve7e = new Wall(newmarket, 9, 8, Direction.EAST);
		Wall blockAv8e = new Wall(newmarket, 10, 8, Direction.EAST);

		// Wall blockAve32w = new Wall(newmarket, 3 ,2 , Direction.WEST);
		Wall blockAve33w = new Wall(newmarket, 4, 2, Direction.WEST);
		Wall blockAve35w = new Wall(newmarket, 5, 2, Direction.WEST);
		Wall blockAve36w = new Wall(newmarket, 6, 2, Direction.WEST);
		Wall blockAve37w = new Wall(newmarket, 7, 2, Direction.WEST);
		Wall blockAve39w = new Wall(newmarket, 8, 2, Direction.WEST);
		Wall blockAve310w = new Wall(newmarket, 9, 2, Direction.WEST);
		Wall blockAve311w = new Wall(newmarket, 10, 2, Direction.WEST);
	}

	public static void buildThings(City newmarket) {// Plant the bombs
		Thing t1 = new Thing(newmarket, 4, 5);
		Thing t2 = new Thing(newmarket, 5, 4);
		Thing t4 = new Thing(newmarket, 5, 6);
		Thing t6 = new Thing(newmarket, 6, 4);
		Thing t8 = new Thing(newmarket, 6, 6);
		Thing t10 = new Thing(newmarket, 7, 2);
		Thing t12 = new Thing(newmarket, 7, 4);
		Thing t13 = new Thing(newmarket, 7, 5);
		Thing t16 = new Thing(newmarket, 7, 8);
		Thing t17 = new Thing(newmarket, 8, 2);
		Thing t18 = new Thing(newmarket, 8, 7);
		Thing t19 = new Thing(newmarket, 9, 2);
		Thing t20 = new Thing(newmarket, 10, 4);
		Thing t21 = new Thing(newmarket, 10, 7);
	}

	public static void buildWalls2(City newmarket) {// make America Great Again
		// Again
		Wall blockAve1n = new Wall(newmarket, 3, 2, Direction.NORTH);
		Wall blockAve2n = new Wall(newmarket, 3, 3, Direction.NORTH);
		Wall blockAve3n = new Wall(newmarket, 3, 4, Direction.NORTH);
		Wall blockAve4n = new Wall(newmarket, 3, 5, Direction.NORTH);
		Wall blockAve5n = new Wall(newmarket, 3, 6, Direction.NORTH);
		Wall blockAve6n = new Wall(newmarket, 3, 7, Direction.NORTH);
		Wall blockAve7n = new Wall(newmarket, 3, 8, Direction.NORTH);
		Wall blockAve8n = new Wall(newmarket, 3, 9, Direction.NORTH);
		//
		Wall blockAve1s = new Wall(newmarket, 11, 3, Direction.SOUTH);
		Wall blockAve2s = new Wall(newmarket, 11, 4, Direction.SOUTH);
		Wall blockAve8s = new Wall(newmarket, 11, 5, Direction.SOUTH);
		Wall blockAve3s = new Wall(newmarket, 11, 6, Direction.SOUTH);
		Wall blockAve4s = new Wall(newmarket, 11, 7, Direction.SOUTH);
		Wall blockAve5s = new Wall(newmarket, 11, 8, Direction.SOUTH);
		Wall blockAve7s = new Wall(newmarket, 11, 2, Direction.SOUTH);
		Wall blockAve9s = new Wall(newmarket, 11, 9, Direction.SOUTH);

		Wall blockAve1e = new Wall(newmarket, 3, 9, Direction.EAST);
		Wall blockAve2e = new Wall(newmarket, 4, 9, Direction.EAST);
		Wall blockAve3e = new Wall(newmarket, 5, 9, Direction.EAST);
		Wall blockAve4e = new Wall(newmarket, 6, 9, Direction.EAST);
		Wall blockAve5e = new Wall(newmarket, 7, 9, Direction.EAST);
		Wall blockAve6e = new Wall(newmarket, 8, 9, Direction.EAST);
		Wall blockAve7e = new Wall(newmarket, 9, 9, Direction.EAST);
		Wall blockAv8e = new Wall(newmarket, 10, 9, Direction.EAST);
		Wall blockAv9e = new Wall(newmarket, 11, 9, Direction.EAST);

		// Wall blockAve32w = new Wall(newmarket, 3 ,2 , Direction.WEST);
		Wall blockAve33w = new Wall(newmarket, 4, 2, Direction.WEST);
		Wall blockAve35w = new Wall(newmarket, 5, 2, Direction.WEST);
		Wall blockAve36w = new Wall(newmarket, 6, 2, Direction.WEST);
		Wall blockAve37w = new Wall(newmarket, 7, 2, Direction.WEST);
		Wall blockAve39w = new Wall(newmarket, 8, 2, Direction.WEST);
		Wall blockAve310w = new Wall(newmarket, 9, 2, Direction.WEST);
		Wall blockAve311w = new Wall(newmarket, 10, 2, Direction.WEST);
		Wall blockAve312w = new Wall(newmarket, 11, 2, Direction.WEST);
	}

	public static void turnRight(Robot z) {// turns the robot right, a basic
		// feature
		z.turnLeft(); // turning left 3 times makes it go right
		z.turnLeft(); // why isn't this included in the package?
		z.turnLeft(); // this seems like a core feature
	}// end turnRight

	public static void moveRobot(int move, Robot z) { // moves the robot by a
		// specified amount by
		// another method
		for (int x = 0; x < move; x++) {// makes sure the robot moves by the
			// specified number of units
			if (z.frontIsClear() == true) {// makes it so the robot doesn't
				// crash into a wall or something
				z.move(); // moves the robot
			} // end if
		} // end for
	}// end method

	public static void clearMines(Robot z) {

		if (z.canPickThing() == true) {
			z.pickThing();
		}
	}// end clearMines()

	public static void clearStreet(Robot z) {
		int x = 0;
		while (z.frontIsClear() == true) {
			clearMines(z);
			x++;
			moveRobot(1, z);
		} // clears the mines through the street
	}// end clearStreet()

	public static int[] findGrid(Robot z, int[] x) { // clears a whole grid
		/*
		 * in case we start in the middle or somewhere not on the max/min, I
		 * have the robot travel to a maximum then travel back and measure
		 * 
		 * this is why I have changed the starting point to 4,2 instead of 3,1
		 */

		int xValue = 0; // array X
		int yValue = 0;// array Y
		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
		} // end while
		z.turnLeft(); // 90 turn
		z.turnLeft();// 180 turn
		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
			xValue++;// at a max or min, go to the other and measure the middle.
		} // end while

		z.turnLeft();// 90 turn to measure the next

		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moves it once toward a max or min
		} // end while

		z.turnLeft();// 90 turn
		z.turnLeft();// 180 turn

		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
			yValue++;// measuring
		} // end while

		int[] arr1 = new int[2];

		x[0] = xValue;
		x[1] = yValue;

		return x;
	}// end method

	public static void clearGrid(Robot z) {
		turnRight(z);
		int y = 0;
		for(int x = 0; x<yValue/2+1; x++){ //enough iterations for the robot to clear grid at 2 changes per time, odd number for the +1
			while (z.frontIsClear() == true) {
				if(z.canPickThing() == true){
					z.pickThing();
					grid[y][x] = true; //x and y are switched becuase of poor planning on my part, ignore pls
				}//end if
				moveRobot(1, z);//moves the robot
				y++;//adds one to y
			}//end while
			y=0;
			turnRight(z); 
			moveRobot(1,z);
			turnRight(z);

			while (z.frontIsClear() == true) {

				if(z.canPickThing() == true){
					z.pickThing();
					grid[y][x] = true;
				}
				moveRobot(1, z);
				y++;
			}
			y=0;
			z.turnLeft();
			moveRobot(1,z);
			z.turnLeft();
		}
	}

	public static void putThemBack(Robot z) {// replaces the mines
		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
		} // end while
		z.turnLeft(); // 90 turn
		z.turnLeft();// 180 turn
		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
		} // end while

		z.turnLeft();// 90 turn to measure the next

		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moves it once toward a max or min
		} // end while

		z.turnLeft();// 90 turn
		z.turnLeft();// 180 turn

		while (z.frontIsClear() == true) {
			moveRobot(1, z);// moving
		} // end while
		turnRight(z);	//moves the robot to the top left corner and faces it to the right



		for(int a = 0; a<grid.length; a++){
			moveRobot(1, z);
			for(int b = 0; b<grid[a].length; b++){
				if(grid[a][b] == true){
					z.putThing();
				}
			}
		}



	}// end method

	public static void printToFile(boolean[][] x){
		//Working with Buffer reader object
		BufferedReader br = null; 
		try {
			br = new BufferedReader(new FileReader("data.txt")); 
			br.readLine(); //reads text file line by line


		} catch (IOException e) {
			e.printStackTrace();
		} finally { //close file
			if (br != null) try {
				br.close();
			} catch (IOException e2) {
				//print error
				System.out.println(e2);
			}
		}



		//Working with Buffer Writer file
		int row = 0; //int for tracking which mine
		BufferedWriter bw = null; 
		try {
			bw = new BufferedWriter(new FileWriter("Data.txt")); 
				bw.write("amount of bombs - " + amountOfThingsInBackpack + "\n" + "does this work?");
								
			
			bw.newLine(); //new line

			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //close file
			if (bw != null) try {
				bw.close();
			} catch (IOException e2) {
				// print the error
				System.out.println(e2);
			}
		} // end try/catch/finally
	}
}// end class
/* 
 * Robot Assignment Part A – Clearing the Mine Field A number of celebrities
 * have made the clearing and banning of landmines their cause. After line mines
 * have been used, often times agricultural lands is unusable as it becomes too
 * dangerous to farm. This program is a simulation of a robot that could collect
 * land mines. You will write a program that will clear all the mines (Things)
 * from a field. Write the following methods into ClearMines.java class
 * (Downloaded in the moodle) moveStreet( int numMove) – to move the robot. Use
 * a loop inside the method in order to move numMove turnRight() - a method that
 * will simulate a right turn by doing 3 left turns. clearStreet() – walks the
 * length of a street until a wall is encountered and picks up all landmines or
 * Things along the way. clearMines() – works on a grid that is open on the top
 * left corner and clears all mines from the grid. See sample diagram below. It
 * must call clearStreet(). You will need to keep track of the number of mines
 * as well the location of each mile (Street coordinate row number and column
 * number) Your program should and should work on a field of any size and with
 * any number of mines. It will be tested with blind data. You may assume the
 * robot will always start in the right position and be facing in the right
 * direction to enter the field. • Create a displayMineArray method that will
 * display the mines and it is coordinates Make sure that the array is sorted by
 * row number. Display should look like that: Mine Number Street row Street
 * Column 1 2 3 2 3 4 Total number of mines is: _______ • Keep track of your
 * time from the moment the robot enter the city until the robot ends clearing
 * the mines and display how long it took the robot to clear the mines. •
 * Display the label done clearing mines when the robot is done Use the Robot
 * documentation to help use the predefined methods Part B • Save the Array
 * content that holds the mine numbers and its coordinate into a text file. •
 * Check the Moodle for File output example. (You will need to use Try and Catch
 * when dealing with File I/O) Part C • Clear your array. • Read the info from
 * the File back into the Array • Go through the Array and place the mines back
 * onto their original spots. When done copy your code in this document and
 * submit to the moodle along with the .java files
 */