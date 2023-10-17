import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisturbingBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisturbingBird extends Actor implements GameElement
{
    /**
     * Act - do whatever the DisturbingBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 1; // 1 untuk bergerak ke bawah, -1 untuk bergerak ke atas
    
    public DisturbingBird() {
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }

    public void act() {
        moveBird();
    }

    private void moveBird() {
        setLocation(getX(), getY() + direction);

        if (getY() <= 0 || getY() >= getWorld().getHeight() - 1) {
            direction *= -1; // Balik arah ketika mencapai batas atas atau bawah layar
        }

        if (isTouching(Flappybird.class)) {
            // Logika ketika burung mengganggu menyentuh Flappybird
            Greenfoot.playSound("disturb.mp3");
            getWorld().removeObject(this);
        }
    }
}

