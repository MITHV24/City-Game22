package game;
import city.cs.engine.*;
public class Coin extends StaticBody {
    private static final Shape CoinShape = new PolygonShape(-0.73f,0.85f, -0.76f,-0.23f, -0.38f,-0.84f, 0.38f,-0.84f, 0.96f,-0.13f, 0.66f,0.82f, -0.72f,0.86f);
    private static final BodyImage image= new BodyImage("data/coin.gif", 3);

    public Coin(World world){
        super(world,CoinShape);
        addImage(image);
    }
}
