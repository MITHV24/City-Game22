package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import org.w3c.dom.ranges.Range;

public class Enemy extends Walker implements StepListener {

    private static final Shape EnemyShape = new PolygonShape(-1.94f, 1.27f, -0.24f, 1.92f, 1.44f, 0.96f, 1.77f, -1.37f, 0.0f, -1.7f, -1.94f, -0.36f, -1.95f, 1.26f);
    private static final BodyImage image = new BodyImage("data/vampire.gif", 10f);
    static int credits;
    private static final float SPEED = 15;
    private final int Rangel = 20;
    private final int Ranger = 9;
    private float right;
    private float left;


    public Enemy(World world) {
        super(world, EnemyShape);
        addImage(image);
        world.addStepListener(this);
        startWalking(SPEED);
        credits = 0;
        setGravityScale(0);
    }

    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x - Rangel;
        right = position.x + Ranger;


    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right) {
            startWalking(-SPEED);
        }
        if (getPosition().x < left) {
            startWalking(SPEED);
        }

    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }

    public int getCredits() {
        return credits;
    }

    public static void setCredits(int credits) {
        Enemy.credits = credits;
    }
}
