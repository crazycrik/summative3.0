import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class meteor {//new class
	int x_pos = 0;
	int y_pos = 0; //some declerations
	
	public meteor(int x, int y){//open method
		x_pos = x;//x
		y_pos = y;//y
	}//construction
	
	
	public Rectangle hitBox = new Rectangle(x_pos,y_pos,10,10);//new hitbox

	//Methods  
	//moveShot
	public void moveMetY(int y){//open method
		y_pos+=y;//move y 	
	}//end method
	
	public void moveMetX(int x){//open method
		x_pos += x;//move x
	}//end method
	
	public int getYPos(){//open method
		return y_pos;//get y
	}//end method
	//getX
	public int getXPos() {//open method
		return x_pos;//get y
	}//end method

	public void drawRock(Graphics g){//open method
		g.setColor(Color.BLUE);//colour of asteroids
		g.fillOval(x_pos, y_pos, 15, 20);//make the rock
	}//end method
	public boolean checkInter(Rectangle r){//open method
		hitBox.x = getXPos();//x
		hitBox.y = getYPos();//y
		return r.intersects(hitBox);//check
	}//end method
}//end class
