package interf;

public abstract class  Car extends MotorisedVehicle implements IVehicle {
	public void breaks() {
		System.out.println("The car is in break mode");
	}
}
