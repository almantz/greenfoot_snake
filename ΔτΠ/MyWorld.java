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

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
    }

    /**
     * 
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
}
