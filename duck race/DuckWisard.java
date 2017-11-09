import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DuckWisard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DuckWisard extends Actor
{
    /**
     * Act - do whatever the DuckWisard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long lastAdded = System.currentTimeMillis();
    public void act() 
    {
        int swimMove = 5;
        if( getX() < 819 )
        {
            long curTime = System.currentTimeMillis();
            if( curTime >= lastAdded + 1000 ) //2000ms equals 2s
            {
                if( Math.random() < 0.20 )
                {
                    swimMove = swimMove + (int)( Math.random() * 101 ) + 1;
                }
                else if( Math.random() < .40 )
                {
                    swimMove = swimMove + (int)( Math.random() * 51 ) + 1;
                }
                else if( Math.random() < .65 )
                {
                    swimMove = swimMove + (int)( Math.random() * 26 ) + 1;
                }
                else
                {
                    swimMove++;
                }
                lastAdded = curTime;
                setLocation( getX() + swimMove, getY() );
            }
        }
        else
        {
            setLocation( 819, getY() );
        }
        int percent = ( getX() - 70 ) * 100 / 759 + 2;
        getWorld().showText( percent + "%", 910, getY() );
    }
}    
