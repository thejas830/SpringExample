package com.loose.coupling;

public class WebDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return  " WebUser Details From Database for Loose coupling code.";
    }

}
