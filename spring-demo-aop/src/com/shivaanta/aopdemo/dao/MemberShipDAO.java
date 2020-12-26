package com.shivaanta.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {

	public void addSilly() {
		System.out.println(getClass()+"  Doing my DB work: Adding an MemberShipDAO");
	}
}
