/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.inter;

import bean.Config;

/**
 *
 * @author V&V
 */
public interface Process {
    
    public abstract void processLogic();
    
    public default void process(){
        Config.save();
    }
}

