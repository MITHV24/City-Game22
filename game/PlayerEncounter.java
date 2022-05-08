package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.CollisionEvent;
public class PlayerEncounter implements CollisionListener {
    private Player player;

    public PlayerEncounter(Player p) {
        this.player = p;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Enemy) {
            player.setLives(player.getLives() - 1);

        }
    }
}
