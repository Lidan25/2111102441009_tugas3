import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 */
interface GameElement{
void act();
}

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Flappybird(), 100, 300);
        addObject(new Pipe(), 300, 150);
        addObject(new Pipe(), 600, 150);
        addObject(new Score(), 300, 100);
        addObject(new DisturbingBird(), 450, Greenfoot.getRandomNumber(300));
    }
}
