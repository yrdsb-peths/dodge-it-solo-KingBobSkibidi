import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * Lucian Bai
 * April 14
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero(){
        
    }
    
    public void act()
    {
        for (int i=0; i < 4; i++){
            move(10);
            turn(5);
        }
    }
}
