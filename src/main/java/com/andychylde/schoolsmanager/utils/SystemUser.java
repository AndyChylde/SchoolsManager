package com.andychylde.schoolsmanager.utils;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Femi Falase
 */
@Entity
@Table(name = "systemuser")
public class SystemUser implements Serializable{

//    Attributes................................................................
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int systemUserId;
    @Column(name="username",length=255,nullable=false)
    protected final String username;
    @Column(name="password",length=200,nullable=false)
    protected String password;

//    Constructor(s)............................................................
    public SystemUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

   
    
    

//    Setters and Getters.......................................................
    public int getSystemUserId() {
        return systemUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
