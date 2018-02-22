package engines;

import models.GameModel;

/**
 * Wind Engine will simulate the effect of the wind on the ball in flight.

 */
public class WindEngine{
    public void updateState(GameModel state)
     {
        double oldXVelocity = 0;

        {
          double backXVelocity = (state.getBall().getxVelocity());
          state.getBall().setxVelocity((backXVelocity - .018));
        }
     }
  }
