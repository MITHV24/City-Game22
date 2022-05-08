package game;
import city.cs.engine.*;
public class Bluegem extends Walker {
    private static final Shape BluegemShape = new PolygonShape(-0.01f,3.19f, -3.19f,-0.07f, 0.03f,-2.93f, 3.22f,0.06f, 0.04f,3.19f);
    static int credits;

    private static final BodyImage image= new BodyImage("data/Bluegem.gif", 1);

    public Bluegem(World world){
        super(world,BluegemShape);
        addImage(image);
        credits=0;
        setAlwaysOutline(false);
    }
    public int getCredits(){
        return credits;
    }
    public static void setCredits(int credits) {
        Bluegem.credits = credits;
    }
}

