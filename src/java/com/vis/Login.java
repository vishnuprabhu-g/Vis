/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vis;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author vishnu-pt517
 */
public class Login extends ActionSupport {

    private static final long serialversionUID = 1L;
    private String uname;

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String execute() {
        System.out.println("Inside of the login class");
        if (this.uname.equalsIgnoreCase("vishnu")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
