package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class PlayerCollision implements CollisionListener {
    private Player player;
    public PlayerCollision(Player player){this.player=player;}

    @Override
    public void collide(CollisionEvent e ){
        if(e.getOtherBody() instanceof game.Coin){
            player.setCoin(player.getCoin() + 1);
            e.getOtherBody().destroy();
        }
        else if (e.getOtherBody() instanceof game.Bluegem){
            player.setBluegem(player.getBluegem()+3);
            e.getOtherBody().destroy();
        }
        else if(e.getOtherBody()instanceof game.Enemy){
            player.setLives(player.getLives()-1);
        }
    }
}

