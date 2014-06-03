package com.fp.projects.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

public class HttpClientExample {

	
	@Test
	public void clientAbortMehtod() throws URISyntaxException{
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		URI uri = new URI("http://www.cnblogs.com");
		HttpGet httpGet = new HttpGet(uri);
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			System.out.println("-------------------");
			System.out.println(response.getStatusLine());
			httpGet.abort();
			
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
