   
/**
 * Holds my person information.
 * 
 * @author Josh
 * @version 9-28-12
 */
public class Person {
    private String name;
    private String country;
    private int age;
    
    public Person( String nName, String nCountry, int nAge ) {
        name= nName;
        country= nCountry;
        age= nAge;
    }
    
    public void setName( String nName ){
        name= nName;
    }
    
    public String getName() {
        return name;
    }
    
    final public void setCountry( String nCountry ) {
        country= nCountry;
    }
    
    public String getCountry() {
        return country;
    }
    
    public int getAge() {
        return age;
    }
    
}
