package engines;

import models.GameModel;

/**
 * Collision Engine sole purpose is to detect collisions between objects
 in our scene and react appropriately.

 */
public class CollisionEngine{
    public void updateState(GameModel state)
     {
        double oldYVelocity = 0;
       if (state.getBall().getY() < 0)
       { state.getBall().setY(0);
       double reverseYVelocity = -(state.getBall().getyVelocity());
       state.getBall().setyVelocity((reverseYVelocity*.80));
        }


     }




    }
