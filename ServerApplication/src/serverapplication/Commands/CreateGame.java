/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication.Commands;



import serverapplication.Gomoku.Player;
import serverapplication.Gomoku.Game;
import serverapplication.Gomoku.GameManagement;
/**
 *
 * @author user
 */
public class CreateGame extends AbstractCommand{
    private final GameManagement gameManagement = GameManagement.getInstance();
    

    public CreateGame(String command) {
        super(command);
    }

    @Override
    public String execute(Object... arguments) {
        Player player = (Player) arguments[0];
        player.setToken('x');
        Game game = new Game();
        game.addPlayer(player);
        player.setGame(game);
        gameManagement.addGame(game);
        return "Game created. Your token is 'x'. Wait an opponent";
    }
}
