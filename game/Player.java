package game;

import city.cs.engine.*;

public class Player extends Walker {
    private int coin;
    private int lives = 5;
    private int Bluegem;
    private int Lives;
    private static final Shape playerShape = new PolygonShape(
            -0.11f, 2.08f,
            0.87f, 1.68f,
            0.99f, 0.49f,
            0.24f, -2.0f,
            -0.95f, -2.0f,
            -1.14f, 1.41f);

    private static final BodyImage image =
            new BodyImage("data/together.gif", 5f);

    private int credits = 0;

    public Player(World world) {
        super(world, playerShape);
        addImage(image);
        credits = 0;
        coin = 0;
        Lives = 3;


    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public void setBluegem(int Bluegem) {
        this.Bluegem = Bluegem;
    }

    public int getBluegem() {
        return Bluegem;

    }

    public void setLives(int lives) {
        this.Lives = Lives;
    }

    public int getLives() {
        return Lives;


        // setter and getter
        //public void setLives(int lives){
        //this.lives = lives;
        //System.out.println("Lives: " + lives);
        //}

        // public int getLives() {
        // return lives;
    }
}
