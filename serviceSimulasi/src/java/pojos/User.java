package pojos;
// Generated Dec 9, 2018 2:24:07 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable,Comparable<User>{


     private String username;
     private String password;

    public User() {
    }

    public User(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

  public String toJson() {
        return "{\"email\":\"" + getUsername()+ "\",\"password\":\"" + getPassword()+ "\"}";
    }
    
    @Override
    public int compareTo(User user) {
        return this.username.compareTo(user.username);
    }


}


