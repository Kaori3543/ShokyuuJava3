import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car1 extends Vehicle implements KeyListener{
	public Car1(int x,int y,int vx, int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+20, y, 40, 20);
		frame.fillRect(x, y+20, 80, 20);
		frame.fillOval(x+10, y+40, 20, 20);
		frame.fillOval(x+50, y+40, 20, 20);
	}
	//キーから文字が入力されたとき
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
		
	}
	//キーが離されたとき
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}


}	
