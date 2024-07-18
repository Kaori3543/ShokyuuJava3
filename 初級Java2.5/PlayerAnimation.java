
public class PlayerAnimation extends MyFrame{
	public void run() {
		Car1 player=new Car1(100,200,0,0);
		addKeyListener(player);
		while(true) {
			clear();
			player.draw(this);
			player.move();
			sleep(0.1);
		}
	}

}
