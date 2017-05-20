import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class SpaceShip{
	//Variables
	Graphics graph;//new graphics
	public int x_pos, y_pos;//x and y pos

	//Contractors
	public SpaceShip(int x, int y) {// constructors
		x_pos = x;//x
		y_pos = y;//y
	}//end const

	//Methods
	//generateShot
	public Shot generateShot () {//open method
		return new Shot(x_pos,y_pos);//generate new shot
	}//
	//   moveX
	public void moveX(int x){//end 
		x_pos+=x;//moves on x axis
	}//end method
	// moveX


	public void drawPlayer(Graphics g) {//open method
		g.setColor(Color.red);//make res
		int [] x_poly = {x_pos, x_pos - 10, x_pos, x_pos + 10};//x points
		int [] y_poly = {y_pos, y_pos + 15, y_pos + 10, y_pos + 15};//y points
		g.fillPolygon(x_poly, y_poly, 4);//draws ship
	}//end method

	public void moveY(int i) {//open method
		y_pos += i;//moves shop on y axis (not used)
	}//end method
}//end class

