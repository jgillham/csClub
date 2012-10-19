
/**
 * Abstract class Simulation - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Simulation {
    /**
     * Bootstraps the simulation.
     */
    static public void main( String[] args ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Signals the state of the simulation.
     */
    public enum Status {
        RUNNING, SUCCESS
    }
    
    /** Holds a copy of the character. */
    private Character character;
    
    /**
     * Initializes the class.
     */
    public Simulation( Character character ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Contains a loop which gets actions and processes them.
     */
    public void run( ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Wraps calls to Character to verify correct actions.
     */
    public CustomRobot.Action getAction() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Uses the map and information from the character to list acceptable
     *  actions.
     */
    public CustomRobot.Action getAllowedActions() {
        throw new UnsupportedOperationException();
    }
}
