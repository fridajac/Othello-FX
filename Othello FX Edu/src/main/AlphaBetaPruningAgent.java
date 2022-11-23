package main;

import com.eudycontreras.othello.capsules.AgentMove;
import com.eudycontreras.othello.controllers.Agent;
import com.eudycontreras.othello.controllers.AgentController;
import com.eudycontreras.othello.enumerations.PlayerTurn;
import com.eudycontreras.othello.models.GameBoardState;
import com.eudycontreras.othello.threading.ThreadManager;
import com.eudycontreras.othello.threading.TimeSpan;

public class AlphaBetaPruningAgent extends Agent{

    public AlphaBetaPruningAgent() {
        this(PlayerTurn.PLAYER_ONE);
    }

    public AlphaBetaPruningAgent(String name) {
        super(name, PlayerTurn.PLAYER_ONE);
    }

    public AlphaBetaPruningAgent(PlayerTurn playerTurn) {
        super(playerTurn);
    }

    @Override
    public AgentMove getMove(GameBoardState gameState) {
        return getMinimaxMove(gameState);
    }

    private AgentMove getMinimaxMove(GameBoardState gameState){

        int waitTime = UserSettings.MIN_SEARCH_TIME;

        ThreadManager.pause(TimeSpan.millis(waitTime));

        return AgentController.getMinimaxMove(gameState, PlayerTurn.PLAYER_ONE);
    }

}
