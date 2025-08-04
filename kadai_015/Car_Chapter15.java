package kadai_015;

public class Car_Chapter15 {
	private int gear =1;
	private int speed =10;
	public void changeGear(int afterGear){
		gear = afterGear;
		switch(gear){
		case 1  -> {
			System.out.println("ギアを" + gear +"に変更しました"); speed = 10;
		}
		case 2  -> {
			System.out.println("ギアを" + gear +"に変更しました"); speed = 20;
		}        
		case 3  -> {
			System.out.println("ギアを" + gear +"に変更しました"); speed = 30;
		}
		case 4  -> {
			System.out.println("ギアを" + gear +"に変更しました"); speed = 40;
		}
		case 5  -> {
			System.out.println("ギアを" + gear +"に変更しました"); speed = 50;
		}
		}
		 
	}
	public void run(){
		 System.out.println("時速" + speed +"km");
	}

}
