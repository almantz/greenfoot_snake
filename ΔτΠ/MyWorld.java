// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Κλάση MyWorld
 * Εδώ έχουμε όλες τις ενέργειες που γίνονται στον κόσμο του παιχνιδιού μας. Εδώ είναι που δημιουργούνται τα φρούτα μας και δημιουργείται, κινείται και τρώει το φιδάκι μας.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{
    public score s =  new  score();

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Αυτή η συνάρτηση δημιουργεί τον κόσμο. Στην αρχή δημιουργεί το background και μετά δημιουργεί και τοποθετεί στον κόσμο το φιδάκι και από ένα μέχρι 5 φρούτα. Η επιλογή του αριθμού των φρούτων και της θέσης του φιδιού γίνεται τυχαία.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        snake sn =  new  snake();
        addObject(sn, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(s, getWidth() - 50, 20);
        showScore();
        int num = Greenfoot.getRandomNumber(5);
        int i = 1;
        while (i <= num) {
            spawnFruit();
            i = i + 1;
        }
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
    }

    /**
     * Η συνάρτηση διαλέγει ένα αριθμό από το 1 μέχρι το 4 και με βάση αυτόν τον αριθμό εμφανίζει ένα φρούτο στην οθόνη.
     */
    public void spawnFruit()
    {
        int num = Greenfoot.getRandomNumber(4);
        fruit f;
        if (num == 1) {
            f =  new  apple();
        }
        else if (num == 2) {
            f =  new  banana();
        }
        else if (num == 3) {
            f =  new  cherry();
        }
        else {
            f =  new  lemon();
        }
        addObject(f, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }

    /**
     * Με αυτήν την συνάρτηση εμφανίζεται το σκορ στην οθόνη.
     */
    public void showScore()
    {
        GreenfootImage image =  new  GreenfootImage("Score: " + s.number, 24, Color.WHITE,  new  Color(0, 0, 0, 0));
        s.setImage(image);
    }
}
