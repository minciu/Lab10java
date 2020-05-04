/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication.Commands;

import serverapplication.Gomoku.GameManagement;
/**
 *
 * @author user
 */
public class ShowGames extends AbstractCommand{
    private final GameManagement gameManager = GameManagement.getInstance();

    public ShowGames(String command) {
        super(command);
    }

    @Override
    public String execute(Object... arguments) {
        return gameManager.getAvailableGames();
    }
}
