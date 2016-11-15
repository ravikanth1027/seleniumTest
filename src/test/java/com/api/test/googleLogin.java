package com.api.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpDateGenerator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.CookieManager;

public class googleLogin {
	private String cookies;
	//private final String USER_AGENT = "Mozilla/5.0";
 
  @Test
  public void login() throws ClientProtocolException, IOException {
	  String url = "https://accounts.google.com/ServiceLoginAuth";
	  String gmail = "https://mail.google.com/mail/";
	  HttpClient client =  HttpClientBuilder.create().build();
	 HttpGet request = new HttpGet(url);
	 //request.addHeader("User-Agent",USER_AGENT);
	 HttpResponse response = client.execute(request);
	 System.out.println(response.getStatusLine().getStatusCode());
	 
	 

  }
}
