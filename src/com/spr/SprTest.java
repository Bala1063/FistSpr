/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BA391760
 */
public class SprTest {
    public static void main (String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
        MyMessage message=(MyMessage)context.getBean("msg1");
        MyMessage message1=(MyMessage)context.getBean("msg2");
      
        System.out.println(message.getMessage());
         System.out.println(message1.getMessage());
    }
}
