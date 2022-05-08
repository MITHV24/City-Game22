package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerController implements KeyListener {

    private static final float WALKING_SPEED = 8;
    private static final float JUMPING_SPEED = 12;
    private Player player;

    public PlayerController(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_LEFT) {
            player.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_RIGHT) {
            player.startWalking(WALKING_SPEED);
        } else if (code == KeyEvent.VK_SPACE) {
            player.jump(JUMPING_SPEED);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            player.stopWalking();
        } else if (code == KeyEvent.VK_RIGHT) {
            player.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

