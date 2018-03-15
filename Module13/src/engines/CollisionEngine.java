/*
Assignment Details
1.	Define an Engine interface
  o	The engines package contains 5 classes, 4 of which all have an identical method signature "public void updateState(GameState state)". Create an interface in the engines package which defines this method.
2.	Implement the Engine interface
  o	Implement the engines interface in the CollisionEngine, GravityEngine, MovementEngine and the WindEngine.
3.	Update the GameEngine
  o	Now that there is a common interface for all the engines, change the GameEngine so that it has a List of type List<Engine> which contains all the engines in the game and remove all the specific engine fields.
  o	In the updateState method of the GameEngine, loop through the list of engines and invoke each one's updatestate method.  Note that you will still have the updateFromUserInput line in the updateState method of the GameEngine.
*/

package engines;
import models.BallModel;
import models.PlayerModel;
import misc.GameState;


public class CollisionEngine implements Engine{

    public void updateState(GameState state) {
        if (state.getBall().getY() < 0) {
            state.getBall().setY(0);
            double oldYVelocity = state.getBall().getyVelocity();
            state.getBall().setyVelocity(oldYVelocity * -.7);
        }
    }
}
