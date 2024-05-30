package javai;

public class Drive {
	public static void main(String[] args) {
		extracted(new Lambor());
		extracted(new Porche());
		extracted(new Benz());
		extracted(new Genesis());
	}

	private static void extracted(Car car) {
		car.speedUp(100);
		System.out.println(car.getSpeed());
	}
}
