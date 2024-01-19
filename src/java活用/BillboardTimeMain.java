package java活用;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class BillboardTimeMain {
	public static void main(String[] args) {
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		HttpGet request = new HttpGet(newUrls);
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		Document doc = null;
		
		try {
			httpClient = HttpClients.createDefault();
			response = httpClient.execute(request);
			StringBuffer sb = new StringBuffer();
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				sb.append(result);
			}
			doc = Jsoup.parse(sb.toString());
			String id = "charts";
			Element eid = doc.getElementById(id);
			String sdate = eid.attr("data-chart-date");
			System.out.println("今回位のビールボードチャートの日付: " + sdate.trim());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
