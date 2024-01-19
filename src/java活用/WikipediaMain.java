package java活用;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WikipediaMain {
	public static void main(String[] args) {
		String newUrls = "https://jp.wikipedia.org/wiki/ISO_3166-1";
		URL url = null;
		
		try {
			url = new URL(newUrls);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"), 8);
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				if (!line.trim().equals("")) {
					System.out.println(line.trim());
				}
			}
		} catch (Exception e) {
			System.out.println("Wiki Flag Parsing error");
		}
	}
}
