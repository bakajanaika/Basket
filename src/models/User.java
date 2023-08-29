package models;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class User {
    public String login;
    public String pass;

    @Override
    public String toString(){
        return "\nВведите логин: " + login +
                "\nВведите пароль: " + pass;
    }
    public User(String login, String pass){
        this.login=login;
        this.pass=pass;

    }
}
