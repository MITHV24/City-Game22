package game;

import city.cs.engine.*;
import game.BluegemPickup;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    private Player player;


    public GameWorld() {
        super();

        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-1, -5.5f));
        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(-8, 2f));
        StaticBody platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(-10, 11.8f));
        StaticBody platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(10, -3f));


        player = new Player(this);
        player.setPosition(new Vec2(7, -6));

        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(0, 7));


        Coin coin1 = new Coin(this);
        coin1.setPosition(new Vec2(2, -3));
        Coin coin2 = new Coin(this);
        coin2.setPosition(new Vec2(-10, -8));
        Coin coin3 = new Coin(this);
        coin3.setPosition(new Vec2(-6, 5));
        Coin coin4 = new Coin(this);
        coin4.setPosition(new Vec2(8, -2));
        Coin coin5 = new Coin(this);
        coin5.setPosition(new Vec2(-2, -2));


        CoinPickup coinPickup = new CoinPickup(player);
        player.addCollisionListener(coinPickup);

        Bluegem bluegem1 = new Bluegem(this);
        bluegem1.setPosition(new Vec2(1, -10));
        Bluegem bluegem2 = new Bluegem(this);
        bluegem2.setPosition(new Vec2(12, 3));
        Bluegem bluegem3 = new Bluegem(this);
        bluegem3.setPosition(new Vec2(-9, 12));
        Bluegem bluegem4 = new Bluegem(this);
        bluegem4.setPosition(new Vec2(12, -2));


        BluegemPickup collect = new BluegemPickup(player);
        player.addCollisionListener(collect);

        PlayerCollision collision = new PlayerCollision(player);
        player.addCollisionListener(collision);

    }


    public Player getPlayer() {return player;}
    
    }


        // game.PlayerEncounter destroy=new game.PlayerEncounter(player);
        //  player.addCollisionListener(destroy);

        // game.PlayerEncounter collision = new game.PlayerEncounter(player);
        // player.addCollisionListener(collision);

       // }
      //}}