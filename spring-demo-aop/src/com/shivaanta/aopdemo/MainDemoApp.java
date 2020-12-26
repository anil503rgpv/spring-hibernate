package com.shivaanta.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shivaanta.aopdemo.dao.AccountDAO;
import com.shivaanta.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		MemberShipDAO memberShipDAO = context.getBean("memberShipDAO",MemberShipDAO.class);
		
		accountDAO.addAccount();
		
		System.out.println("let's do it again ");
		memberShipDAO.addSilly();
		
		context.close();

	}

}
