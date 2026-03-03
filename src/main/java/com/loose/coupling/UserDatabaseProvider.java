package com.loose.coupling;

public class UserDatabaseProvider  implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return  " User Details From Database for Loose coupling code.";
    }
}
