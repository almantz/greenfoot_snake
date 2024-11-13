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
     * 
     */
    public snake()
    {
    }

    /**
     * Act - ό,τι θέλει να κάνει το φίδι. Καλείται όταν πατιούνται τα κουμπιά 'Act' ή 'Run' .  Το φιδάκι μας κινείται και κοιτάει αν βρήκε φρούτο
     */
    public void act()
    {
        moveSnake();
        checkForFruit();
    }

    /**
     * Με αυτήν την συνάρτηση το φίδι κινείται. Πάει πάνω αν πατήσεις w ή το πάνω βελάκι, κάτω με s ή κάτω βελάκι κλπ. Οι κάθετες γραμμές (||) σημαίνουν ή. Σημείωση: Για να χρησιμοποιήσετε τα κουμπιά wasd το πληκτρολόγιο πρέπει να είναι στα αγγλικά!
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
     * Με αυτήν την συνάρτηση το φίδι κοιτάει αν έχει βρει φρούτο. Αν βρήκε, κοιτάει αν βρήκε λεμόνι με την isLethal(). Αν βρήκε το παιχνίδι τελειώνει. Αλλιώς τρώει το φρούτο. Μήπως πρέπει να κάνει κάτι το σκορ;
     */
    public void checkForFruit()
    {
        if (isTouching(fruit.class)) {
            fruit f = (fruit)getOneIntersectingObject(fruit.class);
            if (f.isLethal()) {
                gameOver();
            }
            else {
                getWorld().removeObject(f);
                MyWorld world = (MyWorld)getWorld();
                world.s.addScore(f.addValue());
                world.showScore();
                world.spawnFruit();
            }
        }
    }

    /**
     * Αυτή η συνάρτηση εμφανίζει το μήνυμα για το τέλος του παιχνιδιού και σταματάει το παιχνίδι.
     */
    public void gameOver()
    {
        Greenfoot.stop();
        GreenfootImage gameover =  new  GreenfootImage("GAME OVER!", 48, Color.RED,  new  Color(0, 0, 0, 0));
        getWorld().getBackground().drawImage(gameover, (getWorld().getWidth() - gameover.getWidth()) / 2, (getWorld().getHeight() - gameover.getHeight()) / 2);
    }
}
