import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class villain here.
 * 
 * @author (your name) 
 * April 14 - v1
 */
public class Villain extends Actor
{
    /**
     * Act - do whatever the Villain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Villain(){   
        GreenfootImage villainImage = new GreenfootImage("kingpin.jpg");
        villainImage.scale(50, 50);
        setImage(villainImage);
    }
    
    public void act()
    {
        move(40);
        int w = getWorld().getWidth();
        int h = getWorld().getHeight();
        
        if (getX() >= w - 50 && getY() <= 50) {
            setRotation(90);
        }
        
        else if (getX() >= w - 50 && getY() >= h - 50){
            setRotation(180);
        }
        
        else if (getX() <= 50 && getY() >= h - 50){
            setRotation(270);
        }
        
        else if (getX() <= 50 && getY() <= 50){
            setRotation(0);
        }
    }
}
