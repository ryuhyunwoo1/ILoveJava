package javaの基礎;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo (double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Geo () {
		/** ソウルの緯度と経度 **/
		this(37.5, 127.0);
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}
}
