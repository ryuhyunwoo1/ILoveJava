package javaの基礎;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Geo> cities = new HashMap<String, Geo>();
		
		cities.clear();
		cities.put("Korea", new Geo(37.5670, 126.9807));
		cities.put("Austria", new Geo(47.01, 10.2));
		cities.put("US", new Geo(40.714086, -74.228697));
		cities.put("Russia", new Geo(55.75222, 37.61556));
		
		System.out.println(cities.size());
		System.out.println(cities.containsKey("Austria"));
		
		Geo geo = cities.get("Austria");
		System.out.printf("%s:　緯度:%f, 経度:%f\n", "Austria", geo.getLatitude(), geo.getLongitude());
	}
}
