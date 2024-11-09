// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Κλάση snake
 * Εδώ βάζουμε τις ενέργειες και τα δεδομένα που χρειαζόμαστε για το φιδάκι μας. Μέσα εδώ ορίζουμε πως κινείται το φίδι, τι μπορεί και τι δεν μπορεί να φάει κλπ.
 */
public class snake extends Actor
{

    /**
     * Act - do whatever the snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveSnake();
        checkForFruit();
    }

    /**
     * Με αυτήν την συνάρτηση το φίδι κινείται. Πάει πάνω αν πατήσεις w ή το πάνω βελάκι, κάτω με s ή κάτω βελάκι κλπ. Οι κάθετες γραμμές (||) σημαίνουν ή.
     */
    public void moveSnake()
    {
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        else if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        else if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
    }

    /**
     * 
     */
    public void checkForFruit()
    {
        if (isTouching(fruit.class)) {
            fruit f = (fruit)getOneIntersectingObject(fruit.class);
            if (f.isLethal()) {
            }
            else {
                getWorld().removeObject(f);
                MyWorld world = (MyWorld)getWorld();
                world.spawnFruit();
            }
        }
    }
}
