package game;


import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import java.awt.*;


public class GameView extends UserView {
    private Image background;
    private Player player;
    private game.Enemy enemy;

    public GameView(GameWorld w, int width, int height) {
        super(w, 800, 600);
        background = new ImageIcon("data/City3.png").getImage();
        player = w.getPlayer();


    }

    @Override
    public void paintBackground(Graphics2D g) {
        System.out.println("paint bg");
        g.drawImage(background, 0, 0, this);
    }


    @Override
    protected void paintForeground(Graphics2D g) {
        g.setColor(Color.white);
        g.setFont(new Font("Lucida Calligraphy", Font.BOLD, 24));
        g.drawString("Coin: " + player.getCoin(), 5, 30);
        g.setColor(Color.red);
        g.setFont(new Font("Lucida Calligraphy", Font.BOLD, 24));
        g.drawString("Lives: " + player.getLives(), 8, 55);
        g.setColor(Color.green);
        g.setFont(new Font("Lucida Calligraphy", Font.BOLD, 24));
        g.drawString("Bluegem: " + player.getBluegem(), 11, 80);


    }

}





