import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.geom.*;



public class snowflakeChris  extends JComponent {
	static Graphics graph;

	static int x = 300; //variables
	static int y = 200;//more variables
	static int size = 30;
	static int endX = 200;//look left
	static int endY = 200;//FOR VARIABLES
	static int counter = 0;
	static int[] arrEndX = new int[6];
	static int[] arrEndY = new int[6];

	private static void drawStar( int x, int y, int size )  {
		graph.drawLine( x, y, endX, endY );

	}//end method


	public void paint(Graphics g) {
		graph = g;
		g.setColor( Color.white );
		g.fillRect( 0, 0, WIDTH, HEIGHT );
		g.setColor(Color.blue);

		//	drawStar( x, y, size ); 
	}//end method


	public static void main(String[] a) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 600, 400);
		window.getContentPane().add(new snowflakeChris());
		window.setVisible(true);

		for(int z = 0;z<6; z++){
			getXRec(endX);
			getYRec(endY);
			counter++;
		}
	}//end main

	public static int getXRec(int x){
		if(x == 0){
			return 0;
		}else{
			arrEndX[counter] = (int) (x + (size*Math.cos( (2*Math.PI/6)*(x-1))));
			System.out.println(arrEndX[counter]);
			return getXRec(x -1);
		}



	}//end method

	public static int getYRec(int x){
		if(x == 0){
			return 0;
		}else{
			arrEndY[counter] = (int) (y - (size*Math.sin( (2*Math.PI/6)*y )));
			return getYRec(x-1); 
		}
	}
}//end class