package com.soap.ws;

import javax.xml.ws.Endpoint;
public class CalculatorServerPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Endpoint.publish("http://127.0.0.1:8080/calc",
				new CalculatorServerImpl());
			}
}	
	
