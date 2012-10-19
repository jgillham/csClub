import java.util.SortedSet;

/**
 * 
 * The robot does not know its own coordinates. This keeps the game fair.
 * 
 * @author Josh Gillham
 * @version (version number or date here)
 */
public class CustomRobot {
    public enum Action {
        Forward, Backwards, TurnLeft, TurnRight
    }
    
    public enum Direction {
        North, East, South, West
    }
    
    public Action makeMove( SortedSet< Action > allowedActions ) {
        throw new UnsupportedOperationException();
    }
}
