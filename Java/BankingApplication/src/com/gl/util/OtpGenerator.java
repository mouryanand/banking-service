package com.gl.util;

public class OtpGenerator {

	public OtpGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public int getOtp() {
		int otp = 0;
		otp = (int)((Math.random() * 9000) + 1000);
		return otp;
	}
}
