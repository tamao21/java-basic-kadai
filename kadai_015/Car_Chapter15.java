package kadai_015;

public class Car_Chapter15 {
	private int gear =1;
	private int speed =10;
	public void changeGear(int afterGear){
		 gear = afterGear;
	}
	public void run(){
		 System.out.println("時速" + speed +"km");
	}

}
