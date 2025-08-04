package kadai_015;

public class Car_Chapter15 {
	private int gear =1;
	private int speed =10;
	public void changeGear(int afterGear){
		
		switch(afterGear){
		case 1  -> {
			System.out.println("ギア"+ gear + "から"+ afterGear + "に切り替えました"); speed = 10; this.gear = afterGear;
		}
		case 2  -> {
			System.out.println("ギア"+ gear + "から"+ afterGear + "に切り替えました"); speed = 20; this.gear = afterGear;
		}        
		case 3  -> {
			System.out.println("ギア"+ gear + "から"+ afterGear + "に切り替えました"); speed = 30; this.gear = afterGear;
		}
		case 4  -> {
			System.out.println("ギア"+ gear + "から"+ afterGear + "に切り替えました"); speed = 40; this.gear = afterGear;
		}
		case 5  -> {
			System.out.println("ギア"+ gear + "から"+ afterGear + "に切り替えました"); speed = 50; this.gear = afterGear;
		}
		default -> {
			System.out.println("ギア"+ gear + "から"+ afterGear+ "に切り替えました"); speed = 10; this.gear = afterGear;
		}
		
		}
		 
	}
	public void run(){
		 System.out.println("速度は時速" + speed +"kmです");
	}

}
