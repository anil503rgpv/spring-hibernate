package com.shivaanta.springdemo;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"I am good boy",
			"you are very nice",
			"Welcome to my world"
	};

	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
