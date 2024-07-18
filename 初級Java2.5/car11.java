
public class car11 extends MyFrame{
	public void run() {
		int x=30;
		int y=40;
		
		for(int i=0; i<5; i++) {
			fillRect(x,y,20,10);
			fillRect(x-5,y+8,32,10);
			fillOval(x-1,y+17,10,10);
			fillOval(x+12,y+17,10,10);
			
			x+=30;
			y+=30;
			
			
			
		}
	}

}