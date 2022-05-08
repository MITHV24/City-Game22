package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class BluegemPickup implements CollisionListener {
    private Player player;

    public BluegemPickup(Player p) {
        player = p;

    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof game.Bluegem) {
            //System.out.println("collided");
            player.setBluegem(player.getBluegem()+3);
            collisionEvent.getOtherBody().destroy();
        }
    }
}

