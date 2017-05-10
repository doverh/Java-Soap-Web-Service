package com.soap.ws;

public class CalculatorServerImpl implements CalculatorServer {

	@Override
	public float sum(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public float subtract(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public float multiply(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public float divide(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	

}
