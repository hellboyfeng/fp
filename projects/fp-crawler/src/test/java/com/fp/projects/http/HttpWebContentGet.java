package com.fp.projects.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Test;

public class HttpWebContentGet {
	
	@Test
	public void get() throws IOException{
		String urlPath="http://www.cnblogs.com";
		URL url = new URL(urlPath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer sb = new StringBuffer();
		String content = "";
		while((content=reader.readLine())!=null){
				sb.append(content+"\r\n");
		}
		System.out.println(sb.toString());
	}
}
