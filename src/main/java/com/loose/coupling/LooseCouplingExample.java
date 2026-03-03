package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManager =new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider dataProviderWeb = new WebDatabaseProvider();
        UserManager userManagerWeb =new UserManager(dataProviderWeb);
        System.out.println(userManagerWeb.getUserInfo());
    }
}
