/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

/**
 *
 * @author BA391760
 */
public class MyMessage {
    private String message;
     private void init()
     {
         System.out.println("Intitilizing");
     }
     private void destroy()
     {
         System.out.println("Destroy");
     }
    public MyMessage() {
    }

    public MyMessage(String message) {
        this.message = message;
    }

    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
