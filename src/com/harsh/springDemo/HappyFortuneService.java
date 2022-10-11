package com.harsh.springDemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Not a good day. Have a great day!";
	}

}
