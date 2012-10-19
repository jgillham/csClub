
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends CustomRobot {
    private Direction facingDirection= Direction.North;
    private Area.Coordinate coordinate;
    
    public Character( Area.Coordinate startingCoordinate ) {
        throw new UnsupportedOperationException();
    }
    
    public Direction getFacingDirection( ) {
        return facingDirection;
    }
}