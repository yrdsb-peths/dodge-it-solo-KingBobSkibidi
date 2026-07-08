import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class defeated here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defeated extends Actor
{
    /**
     * Act - do whatever the Defeated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Defeated() {
        GreenfootImage defeatedImage = new GreenfootImage("defeated.jpg");
        defeatedImage.scale(200, 200);
        setImage(defeatedImage);
    }
}
