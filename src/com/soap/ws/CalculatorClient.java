package com.soap.ws;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CalculatorClient {
	


		public static void main(String args[]) throws Exception {
			URL url = new URL("http://localhost:8080/SoapCalculator/services/CalculatorServerImpl?wsdl");
			QName qname = new QName("http://calc/","CalculadoraServerImplService");
			Service ws = Service.create(url, qname);
			CalculatorServer calc = ws.getPort(CalculatorServer.class);

			System.out.println("Soma (5+1): " + calc.sum(5,1));
			System.out.println("Subtracao (5-1): " + calc.subtract(5,1));
			System.out.println("Multiplicacao (5*1): " + calc.multiply(5,1));
			System.out.println("Divisao (5/1): " + calc.divide(5,1));

		}
	}

