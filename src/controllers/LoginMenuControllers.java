package controllers;

import enums.Regex.Menu;
import models.App;
import models.Result;
import models.User;

public class LoginMenuControllers {

    public Result login(String username, String password) {
        User foundUser = null;
        for (User user : App.user) {
            if (username.equals(user.getUsername())) {
                foundUser = user;
            }
        }
        if (foundUser == null){
            return new Result(false, "username doesn't exist!");
        }
        if (!password.equals(foundUser.getPassword())) {
            return new Result(false, "password is incorrect!");
        }
        App.currentUser = foundUser;
        App.setCurrentMenu(Menu.MainMenu);
        return new Result(true, "user logged in successfully");
    }

    public Result forgotPassword(String username, String email) {
        User foundUser = null;
        for (User user : App.user) {
            if (username.equals(user.getUsername())) {
                foundUser = user;
                break;
            }
        }
        if (foundUser == null) {
            return new Result(false, "username doesn't exist!");
        }
        if (!email.equals(foundUser.getEmail())) {
            return new Result(false, "email doesn't match!");
        }
        return new Result(true, "password: " + foundUser.getPassword());
    }

    public Result showCurrentMenu() {
        return new Result(true, "login menu");
    }

    public void back(){
        App.setCurrentMenu(Menu.SignupMenu);
    }

    public void exit() {
        App.setCurrentMenu(Menu.ExitMenu);
    }
}
