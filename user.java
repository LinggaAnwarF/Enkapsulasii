
package enkapulasi;

public class user {

    
    private String username;
    private String password;
    private int id;
    private boolean status; // true : menikah, false ; bm
     
    //id = o
    // status = false
    
     public user(String username, String password){
        this.username = username;
        this.password = password;
     }
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

 
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}