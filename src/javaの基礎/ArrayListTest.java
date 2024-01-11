package javaの基礎;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Geo> geolist = new ArrayList<Geo>();
		
		geolist.clear();
		
		geolist.add(new Geo(37.5670, 126.9807));
		geolist.add(new Geo(47.01, 10.2));
		geolist.add(new Geo(40.714086, -74.2286967));
		geolist.add(new Geo(39.9075, 116.39723));
		System.out.println(geolist.size());
		
		Geo gt = geolist.get(1);
		System.out.printf("緯度: %f, 経度: %f\n", gt.getLatitude(), gt.getLongitude());
	}
}
