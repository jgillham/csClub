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
        Test vr= new Test( "This is my message" );
        Person person= new Person( "Bob", "USA", 28 );
        
//        String name2= person.name;
//        person.getName();
        
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
                        if( line.equalsIgnoreCase("name") ) {
                                receiveName= true;
                        } else if( line.equalsIgnoreCase( "country" ) ) {
                                receiveCountry= true;
                        } else if( line.equalsIgnoreCase( "age" ) ) {
                                receiveAge= true;
                        }
                }
        }
        System.out.println( "Name = " + name );
		  System.out.println( "TESSSSSSSSSST" );
        System.out.println( "Country = " + country );
        System.out.println( "Age = " + age );
		  System.out.println( "i don't know" );

        
    }
}
