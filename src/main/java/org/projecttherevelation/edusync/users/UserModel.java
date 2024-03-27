package org.projecttherevelation.edusync.users;

import jakarta.persistence.*;

@Entity(name = "users")
public class UserModel {

    @Id
      private String username;
    @Column
    private String hitMail;
    @Column
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getHitMail() {
        return hitMail;
    }

    public void setHitMail(String hitMail) {
        this.hitMail = hitMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
