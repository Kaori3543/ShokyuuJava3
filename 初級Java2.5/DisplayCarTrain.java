
public class DisplayCarTrain  extends MyFrame{
	public void run() {
		Car1 car1=new Car1(10,5,3,0);
		car1.draw(this);
		Train train1=new Train(30,150,3,0);
		train1.draw(this);
	}

}
