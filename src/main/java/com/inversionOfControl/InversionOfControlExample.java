package com.inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InversionOfControlExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInversionOfControl.xml");
        //UserDataProvider dataProvider = new UserDatabaseProvider();
        //UserManager userManager = new UserManager(dataProvider);
        UserManager userManager =(UserManager) context.getBean("userManagerWithUserDataBaseProvider") ;
        System.out.println(userManager.getUserInfo());

        userManager = (UserManager) context.getBean("userManagerWithWebDataBaseProvider");
        System.out.println(userManager.getUserInfo());
    }
}
