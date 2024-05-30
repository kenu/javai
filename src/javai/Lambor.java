package javai;

public class Lambor implements Car {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int speedUp(int km) {
		this.speed = this.speed + km;
		return this.speed;
	}

	public boolean stop() {
		this.speed = 0;
		return true;
	}

	public boolean isStart() {
		return this.speed > 0;
	}
}
