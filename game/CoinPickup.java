package game;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class CoinPickup implements CollisionListener {
    private Player player;

    public CoinPickup(Player p) {
        player = p;

    }


    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof game.Coin) {
            System.out.println("collided");
            player.setCoin(player.getCoin() + 1);
            collisionEvent.getOtherBody().destroy();
        }

    }
}
