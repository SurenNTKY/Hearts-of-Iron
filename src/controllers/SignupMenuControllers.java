package controllers;

import enums.Regex.Menu;
import models.App;
import models.Result;
import models.User;

public class SignupMenuControllers {

    public Result register (String username, String password, String email) {
        //System.out.println(username +"Password: >" + password + "<" +" >"+ email + "<");
        username = username.trim();
        password = password.trim();
        email = email.trim();
        //System.out.println(username +"Password: >" + password + "<" +" >"+ email + "<");
        if (!username.matches("^[A-Za-z][A-Za-z0-9_]*$")){
            return new Result(false, "invalid username");
        }
        for (User user : App.user) {
            if (user.getUsername().equals(username)) {
                return new Result(false, "username is already taken");
            }
        }
        if (password.length() < 8 || password.length() > 20 ) {
            return new Result(false, "invalid length");
        }
        if (password.matches(".*\\s+.*")){
            return new Result(false, "don't use whitespace in password");
        }
        if (!password.matches("^[A-Za-z].*")){
            return new Result(false, "password must start with English letters");
        }
        if (!password.matches(".*[%@#$^&!].*")) {
            return new Result(false, "password doesn't have special characters");
        }
        if (!email.matches("^[A-Za-z0-9]+(?:\\.[A-Za-z0-9]*)?@[a-zA-Z0-9]+\\.com$")){
            return new Result(false, "invalid email format");
        }
        User newUser = new User(username, password, email, 0);
        App.user.add(newUser);
        App.setCurrentMenu(Menu.LoginMenu);
        return new Result(true, "user registered successfully");
    }

    public Result showCurrentMenu() {
        return new Result(true, "signup menu");
    }

    public void login (){
        App.setCurrentMenu(Menu.LoginMenu);
    }

    public void exit() {
        App.setCurrentMenu(Menu.ExitMenu);
    }
}
