/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.userHelper;
import pojos.User;

/**
 *
 * @author Gandhi Nugroho
 */
public class testcekUser {
    public static void main(String[] args) {
        userHelper test = new userHelper();
        User user = test.getUser("admin", "admin");
        if (user != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user);
            System.out.println(json);
        }
        User user1 = test.getUser("admin1", "admin1");
        if (user1 != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user1);
            System.out.println(json);
        }
        User user2 = test.getUser("admin2", "admin2");
        if (user2 != null) {
            Gson gson = new Gson();
            String json = gson.toJson(user2);
            System.out.println(json);
        }
       
    }
}
