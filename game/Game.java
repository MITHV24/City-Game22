package game;

import javax.swing.JFrame;


public class Game {


    public Game() {

        GameWorld world = new GameWorld();
        Player p = world.getPlayer();
        GameView view = new GameView(world, 800, 600);
        view.addMouseListener(new GiveFocus(view));
        view.addKeyListener(new PlayerController(world.getPlayer()));
        final JFrame frame = new JFrame("City Game");
        frame.add(view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        world.start();
    }

    public static void main(String[] args) {
        new Game();
    }
}
