// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Κλάση score
 * Η κλάση αυτή θα κρατάει το σκορ μας. Κάθε φορά που το φιδάκι τρώει ένα φρούτο αυξάνεται το σκορ του. Κάθε φρουτάκι δίνει διαφορετική αύξηση στο σκορ. Υλοποιείστε την για να δούμε πόσους βαθμούς μαζεύουμε!
 */
public class score extends Actor
{
    public int number = 0;

    /**
     * Act - do whatever the score wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * 
     */
    public void addScore(int toAdd)
    {
        number = number + toAdd;
    }
}
