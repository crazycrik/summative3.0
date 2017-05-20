import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Shot {
	//Variables
	private Graphics graph;//new graphics
	private int x_pos, y_pos;//x and y
	
	
	public Shot(int x, int y) {//open const
		x_pos = x;//x
		y_pos = y;//y
	}//constructors
	public Rectangle hitBox = new Rectangle(x_pos,y_pos,10,10);//new hitbox

	//Methods  
	//moveShot
	public void moveShot(int y){//close method
		y_pos+=y;//move y 	

	}//end method
	//getY
	public int getYPos(){//open method
		return y_pos;//get y
	}//
	
	public int getXPos() {//open method
		return x_pos; //get X
	}//end method

	public void drawShot(Graphics g){//open method
		g.setColor(Color.black);//shots colours
		g.fillOval(x_pos, y_pos, 10, 10);//draws circle
	}//end method
	public boolean checkInter(Rectangle r){//open method
		hitBox.x = getXPos();//checks x
		hitBox.y = getYPos();//checks y
		return r.intersects(hitBox);//returns a true/false if intersecting
	}//end method

}//end class
