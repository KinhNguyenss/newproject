
package com.vku.MODEL;


public class DN_ChuModel {
    public static String name = "";
    private String Username;
    private String Password;
    
    public DN_ChuModel(){
        
    }

    public DN_ChuModel(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        name = this.Username;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "DN_ChuModel{" + "Username=" + Username + ", Password=" + Password + '}';
    }
    
}
