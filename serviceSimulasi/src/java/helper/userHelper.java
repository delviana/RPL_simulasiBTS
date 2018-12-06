/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Collections;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author Acer
 */
public class userHelper {
    public List<User> getAllUser() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<User> hasil = null;
        Query q = session.createQuery("from User u");
        hasil = q.list();
        tx.commit();
        session.close();
        return hasil;
    }

    public User getUser(String username, String password) {
        List<User> list = this.getAllUser();
        User user = new User(username, password);
        Collections.sort(list);
        int index = -1;
        if (list.size() > -1) {
            for (int i = 0; i < list.size(); i++) {
                if (username.equals(list.get(i).getUsername())) {
                    index = i;
                }
            }
        } else {
            index = -1;
        }

        if (index < 0) {
            System.out.println("User tidak ada");
            return null;
        } else {
            // user ada
            User result = list.get(index);
            System.out.println("Pencarian = " + result.getUsername() + "," + result.getPassword());
            if (password.equals(result.getPassword())) {
                System.out.println("Username: " + user.getUsername() + "\nPassword: " + user.getPassword());
                return user;
            } else {
                System.out.println("pass salah");
                // pass salah
                return null;
            }
        }
    }

    public static String toJson() {
        UserHelper helper = new UserHelper();
        List<User> list = helper.getAllUser();
        String result = "[";
        for (int i = 0; i < list.size(); i++) {
            if (i < (list.size() - 1)) {
                result += list.get(i).toJson() + ", \n";
            } else {
                result += list.get(i).toJson();
            }
        }
        result += "]";
        return result;
    }
    public void addNewUser(
          String username,String password
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = new User(password, username);
        session.saveOrUpdate(user);
        tx.commit();
        session.close();
    }
}
