/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication.Commands;

import java.util.*;
/**
 *
 * @author user
 */
public abstract class AbstractCommand{
         private final String command;
         private String arguments;
         
    public AbstractCommand(String command) {
        this.command = command;
    }

    public AbstractCommand(String command, String arguments) {
        this.command = command;
        this.arguments = arguments;
    }

    public abstract String execute(Object... arguments);

    

    

    @Override
    public String toString() {
        return command + " " + arguments;
    }

    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @return the arguments
     */
    public String getArguments() {
        return arguments;
    }
}
    
    
    

    
