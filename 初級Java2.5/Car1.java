
public class Car1 extends Vehicle{
	public Car1(int x,int y,int vx, int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+20, y, 40, 20);
		frame.fillRect(x, y+20, 80, 20);
		frame.fillOval(x+10, y+40, 20, 20);
		frame.fillOval(x+50, y+40, 20, 20);
	}


}	
