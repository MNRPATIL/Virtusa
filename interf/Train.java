package interf;

public abstract class Train implements IPublicTransport,IVehicle {
	public void turnLeft() {
		System.out.println("the train is turning left");
	}

}
