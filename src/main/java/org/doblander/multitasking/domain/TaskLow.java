/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.multitasking.domain;

/**
 *
 * @author intruder
 */
public class TaskLow extends Task {

    @Override
    public Object call() throws Exception {
        boolean tooEarlyToQuit = true;
        double i = 0.0;
        
        while (tooEarlyToQuit) {
            i = i + 1.0;
            if (i > 2000000000.0) {
                tooEarlyToQuit = false;
            }
        }
        
    return i;
    
    }
    
}
