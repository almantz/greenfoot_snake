// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Κλάση fruit
 * Εδώ βάζουμε ενέργειες και δεδομένα που θέλουμε να έχουν όλα τα φρουτάκια μας. Ό,τι υπάρχει εδώ, το έχουν και οι υποκλάσεις του φρούτου: apple, banana, cherry.
 */
public class fruit extends Actor
{

    /**
     * Act - do whatever the fruit wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    /**
     * Η συνάρτηση επιστρέφει αν το φρούτο τελειώνει το παιχνίδι. Η προκαθορισμένη τιμή είναι false, δηλαδή το παιχνίδι συνεχίζει. Μήπως αυτό αλλάζει σε κάποιο από τα φρούτα;
     */
    public boolean isLethal()
    {
        return false;
    }

    /**
     * Η συνάρτηση αυτή επιστρέφει πόσο προσθέτει το φρούτο στο σκορ. Η προκαθορισμένη τιμή είναι 0. Δείτε τι επιστρέφει το κάθε φρουτάκι ξεχωριστά στις υποκλάσεις.
     */
    public int addValue()
    {
        return 0;
    }
}
