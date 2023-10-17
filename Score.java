import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements GameElement
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;//membuat variabel score
    public Score(){
        score = 0;//pemberian niali awal score sebesar 0
    }
    public void act()
    {
         World myWorld = getWorld();
        myWorld.showText(String.valueOf(score), 300, 100);//penempatan nilai score/ Add your action code here.
    }
    public static void add(int num){
        score += num;
    }
}
