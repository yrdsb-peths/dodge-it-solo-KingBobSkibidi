import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        Villain v = new Villain();
        addObject(h, 100, 100);
        addObject(v, 450, 100);
    }
}
