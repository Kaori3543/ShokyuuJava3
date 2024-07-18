
public class Animation2 extends MyFrame {
	public void run() {
		int y=100;
		int x=30;
		while(y<=200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y+=5;
			x+=5;
			sleep(0.1);
		}
	}

}
