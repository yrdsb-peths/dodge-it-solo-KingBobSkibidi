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
        for (int i=0; i < 4; i++){
            move(50);
        }
        turn(180);
    }
}
