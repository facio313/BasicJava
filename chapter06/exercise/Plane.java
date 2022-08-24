package chapter06.exercise;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	public Plane() {
//		manufacturer = "";
//		model = "";
//		maxNumberOfPassengers = 0; //없어도 됨 기본 생성자는 다 초기값 / 생성자에서 초기화하는 거 안 됨
		numberOfPlanes++;
	}

//	alt shift s -> generate constructor using fields -> 체크할 거 하거 omit 어쩌고 확인

	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		} else {
			maxNumberOfPassengers = 0;
		}
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
}