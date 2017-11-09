import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 660, 1); 
        
        DuckWisard harry = new DuckWisard();
        addObject( harry, 70, 190 );
        
        DuckUnicorn abigal = new DuckUnicorn();
        addObject( abigal, 70, 293 );
        
        DuckAlien et = new DuckAlien();
        addObject( et, 70, 390 );
        
        DuckClassy bond = new DuckClassy();
        addObject( bond, 70, 492 );
        
        DuckPasteur geoffery = new DuckPasteur();
        addObject( geoffery, 70, 596 );
        
        //Greenfoot.setSpeed( 15 );
        /*if( harry.getX() >= 819 || abigal.getX() >= 819 || et.getX() >= 819|| bond.getX() >= 819|| geoffery.getX() >= 819 )
        {
            System.out.print("winner");
        }*/
    }
}
