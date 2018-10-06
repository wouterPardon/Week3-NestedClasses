package opdracht1;

public class GearboxUsage {
	public static void main(String[] args) {
		Gearbox mcLaren = new Gearbox(3);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(2);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
	}
}
