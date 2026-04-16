import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 *
 * 
 * Lucian Bai
 * April 14 - v1
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero(){
        GreenfootImage heroImage = new GreenfootImage("spiderman.jpg");
        heroImage.scale(50, 50);
        setImage(heroImage);
    }
    
    public void act()
    {
        move(50);
        int w = getWorld().getWidth();
        int h = getWorld().getHeight();
        
        if (getRotation() == 0 && getX() >= w - 50) {
            setRotation(90);
        }
        
        else if (getRotation() == 90 && getY() >= h - 50){
            setRotation(180);
        }
        
        else if (getRotation() == 180 && getX() <= 50){
            setRotation(270);
        }
        
        else if (getRotation() == 270 && getY() <= 50){
            setRotation(0);
        }
    }
}
