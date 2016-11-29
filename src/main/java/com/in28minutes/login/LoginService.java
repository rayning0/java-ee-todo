package com.in28minutes.login;

public class LoginService {
    public boolean validateUser(String user, String password) {
        return password.equals("dummy");
//        return user.equalsIgnoreCase("Raymond") && password.equals("dummy");
    }
}
