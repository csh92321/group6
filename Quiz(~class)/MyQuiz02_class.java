package day11_set_get;

import java.util.concurrent.TimeUnit;

public class MyQuiz02_class {
	private String CarName = null, Color = null;
	private int speed = 0;


	public void setCarName(String carName) {
		CarName = carName;
	}


	public void setColor(String color) {
		Color = color;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void create(String CarName, String Color) {
		setCarName(CarName);
		setColor(Color);

	}

	public void start(int speed) throws InterruptedException {
		setSpeed(speed);
		for (int i = 0; i <= speed; i += 10) {
			if (i <= speed) {
				System.out.println("현재속도:"+i+"Km");
				TimeUnit.SECONDS.sleep(1);
			}
		}

	}

}
