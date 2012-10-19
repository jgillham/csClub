


/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Area {
    public enum Thing {
        Empty, Wall, Package, End
    }
    
    public class Coordinate extends java.awt.Point {
    }
    
    private Thing[][] grid;
    
    public Thing seeCoordinate( Coordinate coordinate ) {
        throw new UnsupportedOperationException();
    }
}