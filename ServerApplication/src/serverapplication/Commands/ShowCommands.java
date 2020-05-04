/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication.Commands;

/**
 *
 * @author user
 */
public class ShowCommands extends AbstractCommand{
    public ShowCommands(String command) {
        super(command);
    }

    @Override
    public String execute(Object... arguments) {
        return "Commands: " + arguments[0];
    }
}
