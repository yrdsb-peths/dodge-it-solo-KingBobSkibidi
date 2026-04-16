import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        Villain v = new Villain();
        addObject(h, 50, 50);
        addObject(v, 550, 50);
    }
}
