import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        Villain v = new Villain();
        addObject(h, 300, 200);
        addObject(v, 100, 200);
    }
}
