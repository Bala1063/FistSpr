/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author BA391760
 */
public class InitBeforeAfter implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
         
        System.out.println("Before loading bean"+" "+string);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("After loading bean"+" "+string);
        return o;
    }
    
}
