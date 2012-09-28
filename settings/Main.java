import java.util.Scanner;
import java.io.File;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    static public void main( String args[] ) {
        File settings= null;
        Scanner fileScan= null;
        try {
                settings= new File( "settings.txt" );
                fileScan= new Scanner( settings ).useDelimiter( ":=|\n" );
        } catch( Exception e ) {
                System.exit( 1 );
        }
        boolean receiveName= false;
        boolean receiveCountry= false;
        boolean receiveAge= false;
        String name= null;
        String country= null;
        int age= 0;
        while( fileScan.hasNext() ) {
                String line= fileScan.next();
                System.out.println( line );
                if( receiveName ) {
                        name= line;
                        receiveName= false;
                } else if( receiveCountry ) { 
                        country= line;
                        receiveCountry= false;
                } else {
                        if( line.equals("name") ) {
                                receiveName= true;
                        } else if( line.equals( "country" ) ) {
                                receiveCountry= true;
                        } else if( line.equals( "age" ) ) {
                                receiveAge= true;
                        }
                }
        }
        System.out.println( "Name = " + name );
        System.out.println( "Country = " + country );
        System.out.println( "Age = " + age );

        
    }
}
